package com.example.randomskillapp.data.repository

import com.example.randomskillapp.data.local.PredefinedSkills
import com.example.randomskillapp.data.local.Skill
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.util.Calendar

class SkillRepository {

    private val _skills = MutableStateFlow<List<Skill>>(emptyList())

    /** Returns the epoch-millis boundaries [start, end) for the current ISO week (Mon–Sun). */
    private fun currentWeekRange(): Pair<Long, Long> {
        val cal = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 0)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            // Move back to Monday
            val dayOfWeek = get(Calendar.DAY_OF_WEEK)
            val daysToMonday = (dayOfWeek - Calendar.MONDAY + 7) % 7
            add(Calendar.DAY_OF_YEAR, -daysToMonday)
        }
        val weekStart = cal.timeInMillis
        val weekEnd = weekStart + 7L * 24 * 60 * 60 * 1000
        return weekStart to weekEnd
    }

    /**
     * Returns the current week's skill.
     * If none exists yet, picks a random one from the predefined list and persists it.
     */
    suspend fun getCurrentWeekSkill(): Skill {
        val (start, end) = currentWeekRange()
        
        val allCurrent = _skills.value
        val existing = allCurrent.find { it.timestamp in start until end }
        if (existing != null) return existing

        val newId = (allCurrent.maxOfOrNull { it.id } ?: 0) + 1
        val random = PredefinedSkills.all.random().copy(
            id = newId, 
            timestamp = System.currentTimeMillis()
        )
        _skills.update { it + random }
        return random
    }

    suspend fun markCompleted(skill: Skill) {
        _skills.update { list ->
            list.map { if (it.id == skill.id) it.copy(isCompleted = true) else it }
        }
    }

    fun getAllSkills(): Flow<List<Skill>> = _skills.asStateFlow()
}

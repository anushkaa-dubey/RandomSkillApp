package com.example.randomskillapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.randomskillapp.data.local.Skill
import com.example.randomskillapp.data.repository.SkillRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class SkillViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: SkillRepository = SkillRepository()

    // ─── Current week skill ───────────────────────────────────────────────
    private val _currentSkill = MutableStateFlow<Skill?>(null)
    val currentSkill: StateFlow<Skill?> = _currentSkill.asStateFlow()

    private val _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    // ─── History ──────────────────────────────────────────────────────────
    val allSkills: StateFlow<List<Skill>> = repository.getAllSkills()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5_000), emptyList())

    init {
        loadCurrentSkill()
    }

    private fun loadCurrentSkill() {
        viewModelScope.launch {
            _isLoading.value = true
            _currentSkill.value = repository.getCurrentWeekSkill()
            _isLoading.value = false
        }
    }

    fun markCompleted() {
        val skill = _currentSkill.value ?: return
        viewModelScope.launch {
            repository.markCompleted(skill)
            _currentSkill.value = skill.copy(isCompleted = true)
        }
    }
}

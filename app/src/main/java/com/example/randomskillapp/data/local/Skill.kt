package com.example.randomskillapp.data.local

/**
 * Domain model used across the app (decoupled from the Room entity).
 */
data class Skill(
    val id: Int = 0,
    val title: String,
    val description: String,
    val steps: List<String>,
    val timestamp: Long,
    val isCompleted: Boolean = false
)

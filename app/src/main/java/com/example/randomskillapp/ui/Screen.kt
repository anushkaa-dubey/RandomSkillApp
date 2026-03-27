package com.example.randomskillapp.ui

sealed class Screen(val route: String, val label: String, val icon: String) {
    object Home    : Screen("home",    "Home",    "home")
    object History : Screen("history", "History", "history")
}

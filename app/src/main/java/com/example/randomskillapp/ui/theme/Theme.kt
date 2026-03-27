package com.example.randomskillapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary          = Purple60,
    onPrimary        = Dark10,
    primaryContainer = Purple20,
    onPrimaryContainer = Purple90,
    secondary        = Teal40,
    onSecondary      = Dark10,
    secondaryContainer = androidx.compose.ui.graphics.Color(0xFF003D35),
    onSecondaryContainer = Teal80,
    background       = Dark20,
    onBackground     = Grey90,
    surface          = Dark30,
    onSurface        = Grey90,
    surfaceVariant   = Dark40,
    onSurfaceVariant = Grey60,
    outline          = Purple40
)

// We ship a dark-only theme for the premium look requested.
@Composable
fun RandomSkillAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        typography  = AppTypography,
        content     = content
    )
}
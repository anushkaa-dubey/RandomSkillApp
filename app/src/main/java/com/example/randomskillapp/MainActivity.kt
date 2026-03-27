package com.example.randomskillapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.randomskillapp.ui.Screen
import com.example.randomskillapp.ui.history.HistoryScreen
import com.example.randomskillapp.ui.home.HomeScreen
import com.example.randomskillapp.ui.theme.Purple60
import com.example.randomskillapp.ui.theme.RandomSkillAppTheme
import com.example.randomskillapp.utils.WorkManagerHelper
import com.example.randomskillapp.viewmodel.SkillViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Schedule weekly notification (idempotent — safe to call every launch)
        WorkManagerHelper.scheduleWeeklyNotification(this)

        setContent {
            RandomSkillAppTheme {
                val navController = rememberNavController()
                val snackbarHostState = remember { SnackbarHostState() }
                val viewModel: SkillViewModel = viewModel()

                val tabs = listOf(Screen.Home, Screen.History)
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                Scaffold(
                    snackbarHost = { SnackbarHost(snackbarHostState) },
                    bottomBar = {
                        NavigationBar(
                            containerColor = androidx.compose.ui.graphics.Color(0xFF14141F)
                        ) {
                            tabs.forEach { screen ->
                                val selected = currentDestination
                                    ?.hierarchy
                                    ?.any { it.route == screen.route } == true

                                NavigationBarItem(
                                    selected = selected,
                                    onClick = {
                                        navController.navigate(screen.route) {
                                            popUpTo(navController.graph.findStartDestination().id) {
                                                saveState = true
                                            }
                                            launchSingleTop = true
                                            restoreState = true
                                        }
                                    },
                                    icon = {
                                        Icon(
                                            imageVector = when (screen) {
                                                is Screen.Home    -> Icons.Default.Home
                                                is Screen.History -> Icons.Default.List
                                            },
                                            contentDescription = screen.label
                                        )
                                    },
                                    label = { Text(screen.label) },
                                    colors = NavigationBarItemDefaults.colors(
                                        selectedIconColor   = Purple60,
                                        selectedTextColor   = Purple60,
                                        indicatorColor      = Purple60.copy(alpha = 0.15f),
                                        unselectedIconColor = androidx.compose.ui.graphics.Color(0xFF9E9EB8),
                                        unselectedTextColor = androidx.compose.ui.graphics.Color(0xFF9E9EB8)
                                    )
                                )
                            }
                        }
                    }
                ) { innerPadding ->
                    NavHost(
                        navController    = navController,
                        startDestination = Screen.Home.route,
                        modifier         = Modifier.padding(innerPadding)
                    ) {
                        composable(Screen.Home.route) {
                            HomeScreen(viewModel = viewModel, snackbarHostState = snackbarHostState)
                        }
                        composable(Screen.History.route) {
                            HistoryScreen(viewModel = viewModel)
                        }
                    }
                }
            }
        }
    }
}
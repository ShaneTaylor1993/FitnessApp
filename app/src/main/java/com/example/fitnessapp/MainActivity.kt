package com.example.fitnessapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.fitnessapp.components.FitnessTabRow
import com.example.fitnessapp.navigation.FitnessTabRowScreens
import com.example.fitnessapp.navigation.Overview
import com.example.fitnessapp.navigation.Workouts
import com.example.fitnessapp.screens.OverviewScreen
import com.example.fitnessapp.screens.WorkoutsScreen
import com.example.fitnessapp.ui.theme.FitnessTheme

class MainActivity: ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessTheme {
                FitnessApp()
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun FitnessApp() {
    FitnessTheme {

        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val currentScreen = FitnessTabRowScreens.find { it.route == currentDestination?.route } ?: Overview

        Scaffold(
            topBar = {
                FitnessTabRow(
                    allScreens = FitnessTabRowScreens,
                    onTabSelected = { newScreen ->
                        navController
                            .navigateSingleTopTo(newScreen.route)
                    },
                    currentScreen = currentScreen
                )
            }
        ) { innerPadding ->
            MyAppNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding))
        }
    }
}

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Overview.route
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Overview.route) {
            OverviewScreen(
                nav = { navController.navigate(Workouts.route) }
            )
        }
        composable(route = Workouts.route) {
            WorkoutsScreen(
                nav = {}
            )
        }
    }
}

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }
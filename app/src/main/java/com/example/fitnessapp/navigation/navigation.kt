package com.example.fitnessapp.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitnessapp.screens.HomeScreen
import com.example.fitnessapp.screens.WorkoutsScreen

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "home"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("home") {
            HomeScreen(
                nav = { navController.navigate("workouts") }
            )

        }
        composable("workouts") {
            WorkoutsScreen(
                nav = {}
            )
        }
    }
}


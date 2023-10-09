package com.example.fitnessapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.ui.graphics.vector.ImageVector

interface FitnessDestination {
    val icon: ImageVector
    val route: String
}

object Overview: FitnessDestination {
    override val icon = Icons.Filled.AccountBox
    override val route = "overview"
}

object Workouts : FitnessDestination {
    override val icon = Icons.Filled.AddCircle
    override val route = "workouts"
}

val FitnessTabRowScreens = listOf(Overview, Workouts)


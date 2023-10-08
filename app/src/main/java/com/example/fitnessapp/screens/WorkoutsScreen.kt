package com.example.fitnessapp.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import com.example.fitnessapp.components.Scaffold

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun WorkoutsScreen() {
    Scaffold(title = "Workouts")
}
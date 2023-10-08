package com.example.fitnessapp.activities

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import com.example.fitnessapp.navigation.MyAppNavHost
import com.example.fitnessapp.screens.WorkoutsScreen

class WorkoutActivity : ComponentActivity() {

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkoutsScreen() {

            }
        }
    }
}
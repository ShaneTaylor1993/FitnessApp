package com.example.fitnessapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import com.example.fitnessapp.screens.HomeScreen
import com.example.fitnessapp.ui.theme.FitnessAppTheme

class MainActivity: ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessAppTheme {
                HomeScreen(nav = {})
            }
        }
    }
}

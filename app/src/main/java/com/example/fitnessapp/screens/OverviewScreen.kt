package com.example.fitnessapp.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.fitnessapp.components.ExerciseCard

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun OverviewScreen(nav: () -> Unit, workoutsExist: Boolean = false) {
    Column() {
        ExerciseCard()
    }

}
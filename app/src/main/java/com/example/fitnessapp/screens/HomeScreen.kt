package com.example.fitnessapp.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.fitnessapp.R
import com.example.fitnessapp.components.Scaffold

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun HomeScreen(nav: () -> Unit) {
    Scaffold(title = stringResource(id = R.string.title), nav)
}
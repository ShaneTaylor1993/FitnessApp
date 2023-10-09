package com.example.fitnessapp.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver


@Composable
fun FitnessTheme(content: @Composable () -> Unit) {

    MaterialTheme(colors = ColorPalette, content = content)
}

/**
 * A theme overlay used for dialogs.
 */
@Composable
fun FitnessThemeOverlay(content: @Composable () -> Unit) {
    // Rally is always dark themed.
    val dialogColors = darkColors(
        primary = Color.White,
        surface = Color.White.copy(alpha = 0.12f).compositeOver(Color.Black),
        onSurface = Color.White
    )

    // Copy the current [Typography] and replace some text styles for this theme.
    val currentTypography = MaterialTheme.typography

    MaterialTheme(colors = dialogColors, content = content)
}
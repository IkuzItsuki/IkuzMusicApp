package com.ikuz.ikuzmusicapp.android.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkBluePalette = darkColors(
    primary = teal700,
    primaryVariant = blue800,
    secondary = cyan600,
    background = darkGreen900,
    surface = Color.Black,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.White,
    onSurface = Color.White,
    error = Color.Red,
)

private val LightBluePalette = lightColors(
    primary = teal700,
    primaryVariant = blue800,
    secondary = cyan600,
    background = darkGreen900,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun IMATheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
){
    MaterialTheme(
        colors = if (darkTheme) DarkBluePalette else LightBluePalette,
        typography = Typography,
        content = content
    )
}
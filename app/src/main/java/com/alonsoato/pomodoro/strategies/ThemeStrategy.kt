package com.alonsoato.pomodoro.strategies

import androidx.compose.ui.graphics.Color

interface ThemeStrategy {

    val primaryColor: Color
    val backgroundColor: Color
    val mainButtonColor: Color
    val secondaryButtonsColor: Color
}
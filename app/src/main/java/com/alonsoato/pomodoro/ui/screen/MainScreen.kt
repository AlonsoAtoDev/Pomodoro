package com.alonsoato.pomodoro.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alonsoato.pomodoro.R
import com.alonsoato.pomodoro.ui.components.ChipWithIcon
import com.alonsoato.pomodoro.ui.components.TextTimer
import com.alonsoato.pomodoro.ui.theme.Red100
import com.alonsoato.pomodoro.ui.theme.Red800
import com.alonsoato.pomodoro.ui.theme.Red900

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    borderColor: Color
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(top = 48.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ChipWithIcon(
            title = "Focus",
            backgroundColor = backgroundColor,
            borderColor = borderColor,
            icon = R.drawable.pomodoro_app_brain_ic
        )
        TextTimer(color = borderColor, minutes = "25", seconds = "10")
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(modifier = Modifier.fillMaxSize(), backgroundColor = Red100, borderColor = Red900)
}
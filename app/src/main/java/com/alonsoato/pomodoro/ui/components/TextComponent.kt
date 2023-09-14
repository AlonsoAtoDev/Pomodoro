package com.alonsoato.pomodoro.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.alonsoato.pomodoro.ui.theme.Red900

@Composable
fun TextTimer(
    modifier: Modifier = Modifier,
    color: Color,
    minutes: String,
    seconds: String
) {
    Column(modifier = modifier.wrapContentSize()) {
        Text(text = minutes, color = color, fontSize = 160.sp)
        Text(text = seconds, color = color, fontSize = 160.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun TextTimerPreview() {
    TextTimer(modifier = Modifier.fillMaxSize(), Red900, "25", "00")
}
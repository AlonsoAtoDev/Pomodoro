package com.alonsoato.pomodoro.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alonsoato.pomodoro.R
import com.alonsoato.pomodoro.ui.theme.Red200
import com.alonsoato.pomodoro.ui.theme.Red900

@Composable
fun ChipWithIcon(
    modifier: Modifier = Modifier,
    title: String,
    backgroundColor: Color,
    borderColor: Color,
    icon: Int
) {
    val circleShape = CircleShape

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .wrapContentSize()
            .border(1.dp, color = borderColor, shape = circleShape)
            .background(color = backgroundColor, shape = circleShape)
            .clip(shape = circleShape)
            .padding(top = 6.dp, bottom = 6.dp, start = 12.dp, end = 12.dp)
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = "sample",
            modifier = Modifier
                .width(28.dp)
                .padding(end = 8.dp)
        )
        Text(text = title, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ChipWithIconPreview() {
    ChipWithIcon(
        title = "Focus",
        borderColor = Red900,
        backgroundColor = Red200,
        modifier = Modifier.fillMaxSize(),
        icon = R.drawable.pomodoro_app_brain_ic
    )
}
package com.alonsoato.pomodoro.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alonsoato.pomodoro.R
import com.alonsoato.pomodoro.ui.theme.Red400

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    color: Color,
    action: () -> Unit
) {
    Button(
        modifier = modifier
            .wrapContentSize(),
        onClick = action,
        colors = ButtonDefaults.buttonColors(containerColor = color)
    ) {
        Image(
            modifier = modifier
                .padding(top = 32.dp, bottom = 32.dp, start = 48.dp, end = 48.dp)
                .size(40.dp),
            painter = painterResource(id = R.drawable.pomodoro_app_play_button),
            contentDescription = "Play"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(modifier = Modifier, color = Red400, {})
}

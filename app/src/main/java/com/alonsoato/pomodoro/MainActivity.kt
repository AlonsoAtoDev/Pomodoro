package com.alonsoato.pomodoro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import com.alonsoato.pomodoro.strategies.ThemeResolver
import com.alonsoato.pomodoro.ui.screen.MainScreen
import com.alonsoato.pomodoro.ui.theme.PomodoroTheme
import com.alonsoato.pomodoro.utils.ThemeColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PomodoroTheme {
                val themeColor = ThemeResolver(ThemeColors.RED)

                with(themeColor.getThemeStrategy()) {
                    MainScreen(
                        backgroundColor = this.backgroundColor,
                        borderColor = this.primaryColor
                    )
                }
            }
        }
    }
}

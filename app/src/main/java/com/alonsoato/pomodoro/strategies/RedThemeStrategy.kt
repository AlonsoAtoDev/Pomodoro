package com.alonsoato.pomodoro.strategies

import com.alonsoato.pomodoro.ui.theme.Red100
import com.alonsoato.pomodoro.ui.theme.Red200
import com.alonsoato.pomodoro.ui.theme.Red400
import com.alonsoato.pomodoro.ui.theme.Red900

class RedThemeStrategy: ThemeStrategy {

    override val primaryColor = Red900

    override val backgroundColor = Red100

    override val mainButtonColor = Red400

    override val secondaryButtonsColor = Red200
}
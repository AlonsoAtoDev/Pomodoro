package com.alonsoato.pomodoro.strategies

import com.alonsoato.pomodoro.ui.theme.Blue200
import com.alonsoato.pomodoro.ui.theme.Blue400
import com.alonsoato.pomodoro.ui.theme.Green100
import com.alonsoato.pomodoro.ui.theme.Green900

class GreenThemeStrategy : ThemeStrategy {

    override val primaryColor = Green900

    override val backgroundColor = Green100

    override val mainButtonColor = Blue400

    override val secondaryButtonsColor = Blue200
}
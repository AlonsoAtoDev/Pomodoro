package com.alonsoato.pomodoro.strategies

import com.alonsoato.pomodoro.ui.theme.Blue100
import com.alonsoato.pomodoro.ui.theme.Blue200
import com.alonsoato.pomodoro.ui.theme.Blue400
import com.alonsoato.pomodoro.ui.theme.Blue900

class BlueThemeStrategy : ThemeStrategy {

    override val primaryColor = Blue900

    override val backgroundColor = Blue100

    override val mainButtonColor = Blue400

    override val secondaryButtonsColor = Blue200
}
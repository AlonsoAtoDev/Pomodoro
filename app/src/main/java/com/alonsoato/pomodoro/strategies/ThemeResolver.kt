package com.alonsoato.pomodoro.strategies

import com.alonsoato.pomodoro.utils.ThemeColors
import com.alonsoato.pomodoro.utils.ThemeColors.BLUE
import com.alonsoato.pomodoro.utils.ThemeColors.DEFAULT
import com.alonsoato.pomodoro.utils.ThemeColors.GREEN
import com.alonsoato.pomodoro.utils.ThemeColors.RED


class ThemeResolver(
    private val colors: ThemeColors
) {

    fun getThemeStrategy() = when (colors) {
        RED -> RedThemeStrategy()
        BLUE -> BlueThemeStrategy()
        GREEN -> GreenThemeStrategy()
        DEFAULT -> RedThemeStrategy()
    }
}
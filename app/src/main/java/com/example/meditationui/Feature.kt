package com.example.meditationui

import android.icu.text.CaseMap
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    val title: String,
    @DrawableRes val iconId :Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)

package com.kamau.studyapp.domain.model

import androidx.compose.ui.graphics.Color
import com.kamau.studyapp.ui.theme.gradient1
import com.kamau.studyapp.ui.theme.gradient2
import com.kamau.studyapp.ui.theme.gradient3
import com.kamau.studyapp.ui.theme.gradient4
import com.kamau.studyapp.ui.theme.gradient5

data class Subject(
    val name: String,
    val goalHours: Float,
    val colors: List<Color>
){
    val subjectCardColors = listOf(gradient1, gradient2, gradient3, gradient4, gradient5)
}

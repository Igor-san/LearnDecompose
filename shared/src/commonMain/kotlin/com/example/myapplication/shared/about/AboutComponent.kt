package com.example.myapplication.shared.about

import com.arkivanov.decompose.value.Value

interface AboutComponent {

    val model: Value<Model>

    fun onBackClicked()

    data class Model(
        val aboutText: String = "О программе!"
    )
}
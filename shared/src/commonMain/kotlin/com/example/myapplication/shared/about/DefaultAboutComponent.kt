package com.example.myapplication.shared.about

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.arkivanov.decompose.value.update
import com.example.myapplication.shared.getPlatformName
import com.example.myapplication.shared.welcome.WelcomeComponent

class DefaultAboutComponent(
    private val componentContext: ComponentContext,
    private val onFinished: () -> Unit,
) : AboutComponent, ComponentContext by componentContext {

    private val state = MutableValue(AboutComponent.Model())
    override val model: Value<AboutComponent.Model> = state
    override fun onBackClicked() {
        onFinished()
    }
}

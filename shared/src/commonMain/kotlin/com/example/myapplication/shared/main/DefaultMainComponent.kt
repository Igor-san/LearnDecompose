package com.example.myapplication.shared.main

import com.arkivanov.decompose.ComponentContext

class DefaultMainComponent(
    componentContext: ComponentContext,
    private val onShowWelcome: () -> Unit,
    private val onShowAbout: () -> Unit,
) : MainComponent, ComponentContext by componentContext {

    override fun onShowWelcomeClicked() {
        onShowWelcome()
    }

    override fun onShowAboutClicked() {
        onShowAbout()
    }
}

package com.example.myapplication.about


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.example.myapplication.shared.about.AboutComponent

@Composable
internal fun AboutContent(
    component: AboutComponent,
    modifier: Modifier = Modifier,
) {
    val model by component.model.subscribeAsState()

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = "About Screen") },
                navigationIcon = {
                    IconButton(onClick = component::onBackClicked) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back button",
                        )
                    }
                },
            )
        },
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = { },
            ) {
                Text(model.aboutText)
            }
        }
    }
}

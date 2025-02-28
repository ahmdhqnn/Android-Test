package org.ahmad.testproject.simpleviewmodel

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel
) {

}

@Preview
@Composable
private fun LoginScreenView() {
    val viewModel = viewModel<LoginViewModel>()
    LoginScreen(
        viewModel = viewModel
    )
}
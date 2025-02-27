package org.ahmad.testproject.simpleviewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel: ViewModel()  {
    private val _username = MutableStateFlow("")
    val username: StateFlow<String> = _username.asStateFlow()
}
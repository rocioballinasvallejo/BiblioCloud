package com.example.bibliocloud.features.auth.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var state by mutableStateOf(LoginState())
        private set

    fun onEmailChanged(nuevoEmail: String) {
        state = state.copy(email = nuevoEmail)
    }
    fun onPasswordChanged(nuevaClave: String) {
        state = state.copy(password = nuevaClave)
    }

    // Función del botón "Entrar"
    fun onLoginClick() {
        if (state.email.isBlank() || state.password.isBlank()) {
            state = state.copy(errorMessage = "¡Oye! No dejes campos vacíos")
        } else {
            state = state.copy(isLoading = true, errorMessage = null)
            // Pa que llames la api bro
            println("Intentando entrar con: ${state.email}")
        }
    }
}
package com.example.bibliocloud.features.auth.presentation.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    // El estado actual de la pantalla (lo que el usuario ve)
    var state by mutableStateOf(LoginState())
        private set

    // Función para cuando el usuario escribe el email
    fun onEmailChanged(nuevoEmail: String) {
        state = state.copy(email = nuevoEmail)
    }

    // Función para cuando el usuario escribe la contraseña
    fun onPasswordChanged(nuevaClave: String) {
        state = state.copy(password = nuevaClave)
    }

    // Función del botón "Entrar"
    fun onLoginClick() {
        if (state.email.isBlank() || state.password.isBlank()) {
            state = state.copy(errorMessage = "¡Oye! No dejes campos vacíos")
        } else {
            state = state.copy(isLoading = true, errorMessage = null)
            // Aquí es donde en el futuro llamaremos a la API
            println("Intentando entrar con: ${state.email}")
        }
    }
}
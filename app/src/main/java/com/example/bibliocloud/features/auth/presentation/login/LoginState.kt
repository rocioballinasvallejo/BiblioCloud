package com.example.bibliocloud.features.auth.presentation.login

// Esta clase guarda la información de la pantalla de Login
data class LoginState(
    val email: String = "",
    val password: String = "",
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
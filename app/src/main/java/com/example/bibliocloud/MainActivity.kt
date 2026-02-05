package com.example.bibliocloud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bibliocloud.features.auth.presentation.login.LoginScreen
import com.example.bibliocloud.features.auth.presentation.login.LoginViewModel
import com.example.bibliocloud.features.auth.presentation.register.RegisterScreen
import com.example.bibliocloud.features.auth.presentation.register.RegisterViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Variable que controla la navegación simple
            var pantallaActual by remember { mutableStateOf("login") }

            if (pantallaActual == "login") {
                val loginVM: LoginViewModel = viewModel()
                LoginScreen(viewModel = loginVM, onIrARegistro = { pantallaActual = "registro" })
            } else {
                val registerVM: RegisterViewModel = viewModel()
                RegisterScreen(viewModel = registerVM, alVolverAlLogin = { pantallaActual = "login" })
            }
        }
    }
}
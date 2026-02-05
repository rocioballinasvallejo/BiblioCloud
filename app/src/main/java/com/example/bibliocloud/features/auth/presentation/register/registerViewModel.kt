package com.example.bibliocloud.features.auth.presentation.register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
    var state by mutableStateOf(RegisterState())
        private set

    fun onNombreChanged(nuevo: String) { state = state.copy(nombre = nuevo) }
    fun onTelefonoChanged(nuevo: String) { state = state.copy(telefono = nuevo) }
    fun onClaveChanged(nuevo: String) { state = state.copy(clave = nuevo) }

    fun registrarse() {
        if (state.nombre.isBlank() || state.telefono.isBlank() || state.clave.isBlank()) {
            state = state.copy(mensajeError = "Completa todos los campos")
        } else {
            state = state.copy(estaCargando = true)
        }
    }
}
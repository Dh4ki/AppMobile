package com.eduardo.appmobile.presentation.screens.auth.login

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {

    var state by mutableStateOf(LoginState())
        private set

    var errorMessage by mutableStateOf("")

    // LOGIN RESPONSE
    //var loginResponse by mutableStateOf<Resource<AuthResponse>?>(null)
    //    private set

    //init {
    //    getSessionData()
    //}

    //fun getSessionData() = viewModelScope.launch {
    //   authUseCase.getSessionData().collect(){data ->
    //        if (!data.token.isNullOrBlank()){
    //            loginResponse = Resource.Success(data)
    //        }
    //    }
    //}

    //fun saveSession(authResponse: AuthResponse) = viewModelScope.launch {
    //    authUseCase.saveSession(authResponse)
    //}

    //fun login() = viewModelScope.launch {
    //    if (isValidateForm()){
     //       loginResponse = Resource.Loading // ESPERANDO
     //       val result = authUseCase.login(state.email, state.password) //RETORNA UNA RESPUESTA
     //       loginResponse = result //EXITOSA / ERROR
     //   }
    //}

    fun onEmailInput(email: String){
        state = state.copy(email = email)
    }

    fun onPasswordInput(password: String){
        state = state.copy(password = password)
    }

    fun isValidateForm(): Boolean{
        if (!Patterns.EMAIL_ADDRESS.matcher(state.email).matches()){
            errorMessage = "El correo electrónico no es válido"
            return false
        }
        else if (state.password.length < 6 ){
            errorMessage = "La contraseña debe tener al menos 6 caracteres"
            return false
        }
        return true
    }


}
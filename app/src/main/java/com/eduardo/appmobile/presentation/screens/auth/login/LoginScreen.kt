package com.eduardo.appmobile.presentation.screens.auth.login

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.eduardo.appmobile.presentation.screens.auth.login.components.LoginContent

@Composable
fun LoginScreen(){
    Scaffold(

    ){ paddingValues ->
        LoginContent(paddingValues)
    }


}

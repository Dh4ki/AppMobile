package com.eduardo.appmobile.presentation.screens.auth.login

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.eduardo.appmobile.presentation.screens.auth.login.components.LoginContent

@Composable
fun LoginScreen(navController: NavHostController){
    Scaffold(

    ){ paddingValues ->
        LoginContent(navController = navController,  paddingValues)
    }
    //Login(navController = navController )
}

package com.eduardo.appmobile.presentation.screens.auth.register

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.eduardo.appmobile.presentation.components.DefaultTopBar
import com.eduardo.appmobile.presentation.screens.auth.register.components.RegisterContent

@Composable
fun RegisterScreen(navController: NavHostController){
    Scaffold(
        topBar = {
            DefaultTopBar(
                title =  "Registro",
                upAvailable = true,
                navController = navController
            )
        },
    ){paddingValues ->
        RegisterContent(paddingValues = paddingValues)
    }
    //Register(navController)
}
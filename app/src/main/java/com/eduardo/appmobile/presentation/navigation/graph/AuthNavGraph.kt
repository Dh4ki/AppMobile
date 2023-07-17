package com.eduardo.appmobile.presentation.navigation.graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.eduardo.appmobile.presentation.navigation.Graph
import com.eduardo.appmobile.presentation.navigation.screen.AuthScreen
import com.eduardo.appmobile.presentation.screens.auth.login.LoginScreen
import com.eduardo.appmobile.presentation.screens.auth.register.RegisterScreen


fun NavGraphBuilder.AuthNavGraph(navController: NavHostController){
    navigation(
        route = Graph.AUTH,
        startDestination = AuthScreen.Login.route
    ){
        composable(route = AuthScreen.Login.route){
            LoginScreen(navController)
        }
        composable(route = AuthScreen.Register.route){
            RegisterScreen(navController)
        }
    }
}
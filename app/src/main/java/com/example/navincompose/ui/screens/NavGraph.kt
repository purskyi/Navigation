package com.example.navincompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screen.FirstScreen.route) {
        composable(route = Screen.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = Screen.SecondScreen.route){
            SecondScreen(navController)
        }
    }
}
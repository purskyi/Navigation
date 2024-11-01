package com.example.navincompose.ui.screens

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument


@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    NavHost(navController = navController,
        startDestination = Screen.FirstScreen.route) {
        composable(route = Screen.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = Screen.SecondScreen.route,
            arguments = listOf(
                navArgument(name = ARGUMENT_KEY){
                    type = NavType.StringType
                    defaultValue = "default value"
                })
        ){
            backStackEntry ->
            val id = backStackEntry.arguments?.getString(ARGUMENT_KEY) ?: "not read the argument"
            val id2 = "not read the argument"

            SecondScreen(navController, Pair(id,id2))
        }
    }
}
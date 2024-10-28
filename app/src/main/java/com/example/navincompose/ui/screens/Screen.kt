package com.example.navincompose.ui.screens

sealed class Screen(val route: String) {
    object FirstScreen: Screen(route = "first_screen")
    object SecondScreen: Screen(route = "second_screen")
}
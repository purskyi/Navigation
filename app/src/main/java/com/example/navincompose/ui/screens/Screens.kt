package com.example.navincompose.ui.screens
const val ARGUMENT_KEY = "id"
sealed class Screen(val route: String) {
    object FirstScreen: Screen(route = "first_screen")
    object SecondScreen: Screen(route = "second_screen/{$ARGUMENT_KEY}"){
        fun passId(id: String):String{
            return "second_screen/$id"
        }
    }
}
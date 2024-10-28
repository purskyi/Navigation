package com.example.navincompose.ui.screens
const val ARGUMENT_KEY = "id"
const val ARGUMENT_KEY2 = "name"

sealed class Screen(val route: String) {
    object FirstScreen: Screen(route = "first_screen")
    object SecondScreen: Screen(route = "second_screen/{$ARGUMENT_KEY}/{$ARGUMENT_KEY2}"){
        fun passId(id: String):String{
            return "second_screen/$id"
        }
        fun passIdAndName(id: String, name: String):String {
            return "second_screen/$id/$name"
        }
    }
}
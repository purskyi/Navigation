package com.example.navincompose.ui.screens
const val ARGUMENT_KEY = "id"
const val ARGUMENT_KEY2 = "id2"

sealed class Screen(val route: String) {
    object FirstScreen: Screen(route = "first_screen")
    object SecondScreen: Screen(route = "second_screen?id={id}"){
        fun passId(id: String = "default value"):String{
            return "second_screen?id=$id"

            /*
                        return "second_screen/$id"
            */
        }
        fun passIdAndName(id: String, name: String):String {
            return "second_screen/$id/$name"
        }
    }
}
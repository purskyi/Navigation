package com.example.navincompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SecondScreen(navController: NavController, ids: Pair<String,String>){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "SECOND HOME ${ids.first} and the hashCode\n${ids.second}",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = Modifier
                .background(MaterialTheme.colorScheme.onPrimary)
                .clickable {
                    navController.navigate(Screen.FirstScreen.route){
                    popUpTo(Screen.FirstScreen.route){
                        inclusive = true
                    }
                    }
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview(){
    SecondScreen(rememberNavController(), ids = Pair("wdw","dwdw"))
}

package com.example.navincompose.ui.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun FirstScreen(navController: NavController){

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){

        Text(text = "FIRST HOME",
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp,
            modifier = Modifier
                .background(Color.Green)
                .padding(horizontal = 10.dp)
                .clickable {
                    navController.navigate(route = Screen.SecondScreen.route)
                })

    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview(){
    FirstScreen(rememberNavController())
}

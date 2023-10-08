package com.example.fitnessapp.components

import android.annotation.SuppressLint
import com.example.fitnessapp.components.Scaffold
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@RequiresApi(Build.VERSION_CODES.Q)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scaffold(title: String) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        modifier = Modifier.padding(horizontal = 12.dp),
                        text = title,
                        style = TextStyle(),
                        fontSize = 24.sp,
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Black
                ),
                actions = {
                    IconButton(
                        onClick = { },
                        modifier = Modifier
                            .size(46.dp),
                        content = {
                            Icon(
                                modifier = Modifier
                                    .size(46.dp),
                                imageVector = Icons.Filled.Add,
                                contentDescription = "",
                                tint = Color.White
                            )
                        }
                    )
                }

            )
        }
    ) {

    }
}

//@RequiresApi(Build.VERSION_CODES.Q)
//@Preview
//@Composable
//fun ScaffoldPreview(){
//
//    Column() {
//        val navController: NavHostController
//        Scaffold(title = "Fitness App", navController = navController)
//    }
//
//}
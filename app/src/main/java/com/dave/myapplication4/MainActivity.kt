package com.dave.myapplication4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dave.myapplication4.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Button(onClick = { println("click") }, content = {
//                Text("Button")
//            })
//            Icon(painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription=null, tint = Color.Black)
            //Image(painterResource(id=R.drawable.ic_launcher_foreground), contentDescription=null)
//            TextField(value = "", onValueChange = {}, label = {
//                Text(text = "Hi")
//            })
//            FloatingActionButton(onClick = { /*TODO*/ },) {
//                Icon(painterResource(id = R.drawable.ic_launcher_foreground),
//                contentDescription=null, tint = Color.Black)
//            }
            ExtendedFloatingActionButton(
                text = {
                    Text(text = "Add")
                },
                icon = {Icon(painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = null, tint = Color.Black) },
                onClick = { /*TODO*/ }
            )


        }
    }
}


@Composable
fun Greeting(name: String){
    Text(text = "Welcome $name ", color = Color.Red, fontSize = 22.sp, fontWeight = FontWeight.Bold)
}
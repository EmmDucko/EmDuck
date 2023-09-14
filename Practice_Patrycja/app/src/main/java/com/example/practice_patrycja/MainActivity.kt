package com.example.practice_patrycja

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practice_patrycja.ui.theme.Practice_PatrycjaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practice_PatrycjaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Texties( "Happy Texting", " Alicja")

                }
            }
        }
    }
}

@Composable
fun Texties (message: String, dear: String, modifier: Modifier = Modifier) {
    Surface(color = Color.LightGray){
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(8.dp)
        ) {
            Text(
                text = message,
                fontSize = 88.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = dear,
                fontSize = 21.sp,
                lineHeight = 67.sp,
                modifier = Modifier
                    .padding(34.dp)
                    .align(Alignment.End)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practice_PatrycjaTheme {
        Texties("Happy Texting" , "Alicja" )
    }
}
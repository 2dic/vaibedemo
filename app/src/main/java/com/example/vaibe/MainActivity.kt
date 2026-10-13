package com.example.vaibe

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.vaibe.ui.theme.VaibeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate вызван") // Add log statement
        enableEdgeToEdge() // Enable edge-to-edge design
        setContent {
            VaibeTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Composable function to display a greeting message
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hey $name!", // Casual greeting
        modifier = modifier
    )
}

// Preview for the Greeting composable function
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VaibeTheme {
        Greeting("Android")
    }
}

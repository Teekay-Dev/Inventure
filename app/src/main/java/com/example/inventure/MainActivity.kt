package com.example.inventure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp()
        }
    }
}

@Composable
fun MainApp() {
    var currentScreen by remember { mutableStateOf("add") }
    var products by remember { mutableStateOf(listOf<Product>()) }

    when (currentScreen) {
        "add" -> AddProductScreen(
            onAddProduct = {
                products = products + it
                currentScreen = "view" // ✅ Go to the view screen after adding
            }
        )
        "view" -> ViewProductScreen(
            products = products,
            onBackClick = { currentScreen = "add" } // ✅ Back arrow leads back to add screen
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainAppPreview() {
    MainApp()
}

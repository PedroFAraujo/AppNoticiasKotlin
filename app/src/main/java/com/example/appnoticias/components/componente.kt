package com.example.appnoticias.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.appnoticias.ui.theme.AppNoticiasTheme


@Composable
fun AppPreview(){
    AppNoticiasTheme{
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            App()
        }
    }
}
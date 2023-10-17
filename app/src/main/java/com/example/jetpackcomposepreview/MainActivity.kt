package com.example.jetpackcomposepreview

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            SetContent()
        }
    }

    @Preview(
        showBackground = true, name = "Pr1", backgroundColor = 0xFF9C27B0,
        showSystemUi = false,
        device = "id:pixel_3a_xl"
    )
    @Composable
    fun SetContent(){
       Text(text = "Working Sample")
    }

}
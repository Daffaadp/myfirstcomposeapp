package com.example.myfirstcomposeapp // Sesuaikan dengan package project-mu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Color.LightGray // Task 3: Pilih warna background pilihanmu (selain Color.Cyan)
            ) {
                MyFirstScreen()
            }
        }
    }
}

@Composable
fun MyFirstScreen() {
    // Task 3: Pilih padding terbaik (misal 24.dp, setelah diuji 8.dp dan 48.dp)
    Surface(color = Color.LightGray) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            // Task 1 & 2: Ganti teks dan gunakan gambar sendiri (my_picture)
            Text(text = "Hi! I am Daffa.")
            Text(text = "My idea: a Student Task Tracker.")
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "My personal profile picture"
            )
        }
    }
}
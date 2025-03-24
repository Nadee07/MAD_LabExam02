package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnbordingScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onbording_screen2)

        findViewById<View>(R.id.btnGetStarted).setOnClickListener {

            val intent = Intent(this, OnbordingScreen3::class.java)
            startActivity(intent)

        }

        val imageView: ImageView = findViewById(R.id.imgprevious1)

        imageView.setOnClickListener{
            val intent = Intent(this,OnbordingScreen1::class.java)
            startActivity(intent)
        }
    }
}
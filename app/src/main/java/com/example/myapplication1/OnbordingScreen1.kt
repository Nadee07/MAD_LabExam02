package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnbordingScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onbording_screen1)

        findViewById<View>(R.id.btnNext).setOnClickListener {

            val intent = Intent(this, OnbordingScreen2::class.java)
            startActivity(intent)


        }
    }
}
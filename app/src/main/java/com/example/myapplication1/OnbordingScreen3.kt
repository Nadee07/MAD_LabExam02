package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnbordingScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onbording_screen3)

        findViewById<View>(R.id.btnGetStarted).setOnClickListener {

            val intent = Intent(this, reg_login_terface::class.java)
            startActivity(intent)

        }

        val imageView: ImageView = findViewById(R.id.imgprevious2)

        imageView.setOnClickListener{
            val intent = Intent(this,OnbordingScreen2::class.java)
            startActivity(intent)
        }
    }
}
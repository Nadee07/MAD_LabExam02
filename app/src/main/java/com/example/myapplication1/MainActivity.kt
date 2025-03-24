package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Fade-out animation
        val fadeOut = AlphaAnimation(1f, 0f).apply {
            var duration = 3000
            var fillAfter = true
        }
        findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.launchScreen).startAnimation(fadeOut)

        // Delay navigation to OnboardingScreen
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnbordingScreen1::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }, 2000) // 2-second delay for a smooth transition
        }


    }









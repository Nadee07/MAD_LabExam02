package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)

        val imageView: ImageView = findViewById(R.id.imageView4)

        imageView.setOnClickListener{
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.button4).setOnClickListener {

            val intent = Intent(this, reg_login_terface::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.button3).setOnClickListener {

            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }
    }
}
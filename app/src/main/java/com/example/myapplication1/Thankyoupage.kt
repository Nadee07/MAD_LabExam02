package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Thankyoupage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_thankyoupage)

        findViewById<View>(R.id.gobackbtn).setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val imageView: ImageView = findViewById(R.id.user2)

        imageView.setOnClickListener{
            val intent = Intent(this,UserProfile::class.java)
            startActivity(intent)
        }
    }
}
package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WeddingCake : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wedding_cake)


        findViewById<View>(R.id.btnorder3).setOnClickListener {

            val intent = Intent(this, Order::class.java)
            startActivity(intent)
        }

        val imageView: ImageView = findViewById(R.id.imgPrev4)

        imageView.setOnClickListener{
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}
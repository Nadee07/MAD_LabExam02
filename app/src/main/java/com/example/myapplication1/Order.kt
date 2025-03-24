package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)

        findViewById<View>(R.id.btnpay).setOnClickListener {

            val intent = Intent(this, Success::class.java)
            startActivity(intent)
        }

        val imageView: ImageView = findViewById(R.id.imgPrev2)

        imageView.setOnClickListener{
            val intent = Intent(this,choco_icingcake::class.java)
            startActivity(intent)
        }
    }
}
package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)


        findViewById<View>(R.id.btnAll).setOnClickListener {

               val intent = Intent(this, Home::class.java)
               startActivity(intent)
           }

        findViewById<View>(R.id.btnBirthdayCake).setOnClickListener {

                val intent = Intent(this, BirthdayCake::class.java)
                startActivity(intent)
           }

        findViewById<View>(R.id.btnWeddingCake).setOnClickListener {

            val intent = Intent(this, WeddingCake::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.btnChocolateCake).setOnClickListener {

            val intent = Intent(this, choco_icingcake::class.java)
            startActivity(intent)
        }

        val imageView: ImageView = findViewById(R.id.imageView6)

        imageView.setOnClickListener{
            val intent = Intent(this,choco_icingcake::class.java)
            startActivity(intent)
        }

        val imageView1: ImageView = findViewById(R.id.imageView8)

        imageView1.setOnClickListener{
            val intent = Intent(this,WeddingCake::class.java)
            startActivity(intent)
        }

        val imageView2: ImageView = findViewById(R.id.imageView10)

        imageView2.setOnClickListener{
            val intent = Intent(this,BirthdayCake::class.java)
            startActivity(intent)
        }

        val imageView3: ImageView = findViewById(R.id.imageView12)

        imageView3.setOnClickListener{
            val intent = Intent(this,BlackForestC::class.java)
            startActivity(intent)
        }

        val imageView4: ImageView = findViewById(R.id.imguser)

        imageView4.setOnClickListener{
            val intent = Intent(this,UserProfile::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.txtHi).setOnClickListener {

            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }





    }
}
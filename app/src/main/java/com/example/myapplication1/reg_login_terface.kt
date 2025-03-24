package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class reg_login_terface : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_reg_login_terface)

        findViewById<View>(R.id.btnReg).setOnClickListener {

            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.btnLogin).setOnClickListener {

                val intent = Intent(this, Login::class.java)
                startActivity(intent)

            }


    }
}
package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val emailEditText = findViewById<EditText>(R.id.edtEmail1)
        val passwordEditText = findViewById<EditText>(R.id.edtTxtPassword1)

        findViewById<View>(R.id.btnLogin1).setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (validateInputs(email, password)) {
                // Proceed with login
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
            }
        }

        findViewById<View>(R.id.textView4).setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }

    private fun validateInputs(email: String, password: String): Boolean {
        if (email.isEmpty()) {
            showToast("Email cannot be empty")
            return false
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showToast("Enter a valid email address")
            return false
        }

        if (password.isEmpty()) {
            showToast("Password cannot be empty")
            return false
        }

        if (password.length < 6) {
            showToast("Password must be at least 6 characters long")
            return false
        }

        return true
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val name = findViewById<EditText>(R.id.edtTxtName)
        val email = findViewById<EditText>(R.id.edtTextEmail)
        val phone = findViewById<EditText>(R.id.editTextPhone)
        val address = findViewById<EditText>(R.id.edtTextAddress)
        val password = findViewById<EditText>(R.id.edtTxtPassword1)
        val confirmPassword = findViewById<EditText>(R.id.edtTxtPassword2)

        findViewById<View>(R.id.btnReg1).setOnClickListener {
            if (validateInput(name, email, phone, address, password, confirmPassword)) {
                // If all validations pass, navigate to Home page
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
            }
        }

        findViewById<View>(R.id.textView6).setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

    private fun validateInput(
        name: EditText, email: EditText, phone: EditText,
        address: EditText, password: EditText, confirmPassword: EditText
    ): Boolean {

        val nameText = name.text.toString().trim()
        val emailText = email.text.toString().trim()
        val phoneText = phone.text.toString().trim()
        val addressText = address.text.toString().trim()
        val passwordText = password.text.toString()
        val confirmPasswordText = confirmPassword.text.toString()

        // Full Name Validation
        if (nameText.isEmpty()) {
            name.error = "Full Name is required"
            return false
        }

        // Email Validation
        if (emailText.isEmpty() || !android.util.Patterns.EMAIL_ADDRESS.matcher(emailText).matches()) {
            email.error = "Enter a valid email address"
            return false
        }

        // Phone Number Validation
        if (phoneText.isEmpty() || !phoneText.matches(Regex("^[0-9]{10}\$"))) {
            phone.error = "Enter a valid 10-digit phone number"
            return false
        }

        // Address Validation
        if (addressText.isEmpty()) {
            address.error = "Delivery Address is required"
            return false
        }

        // Password Validation
        val passwordPattern = Regex("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#\$%^&+=!]).{6,}\$")
        if (passwordText.isEmpty() || !passwordPattern.matches(passwordText)) {
            password.error = "Password must be at least 6 characters long, include uppercase, lowercase, a number, and a special character"
            return false
        }

        // Confirm Password Validation
        if (confirmPasswordText.isEmpty() || confirmPasswordText != passwordText) {
            confirmPassword.error = "Passwords do not match"
            return false
        }

        return true
    }
}

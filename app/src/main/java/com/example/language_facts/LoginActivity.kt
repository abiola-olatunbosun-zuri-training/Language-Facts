package com.example.language_facts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        logIn()
    }

    private fun logIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val logInButton = findViewById<MaterialButton>(R.id.login_button)

        logInButton.setOnClickListener(){
            if (email.toString().isNullOrEmpty() || password.toString().isNullOrEmpty()){
                Toast.makeText(this,"Email or Password is not provided", Toast.LENGTH_LONG).show()
            } else {
                if (email.toString() == "user@email.com" && password.toString() == "09876"){
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this,"Wrong Email or Password", Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}
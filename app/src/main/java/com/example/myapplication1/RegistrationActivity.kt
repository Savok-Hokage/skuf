package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val editTextLogin: EditText = findViewById(R.id.editTextLogin)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
        val buttonRegister: Button = findViewById(R.id.buttonRegister)
        val textViewLogin: TextView = findViewById(R.id.textViewLogin)

        buttonRegister.setOnClickListener {
            val login = editTextLogin.text.toString()
            val password = editTextPassword.text.toString()

            if (validateInput(login, password)) {
                val intent = Intent(this, RegistrationSuccessActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Ошибка. Проверьте ввод и повторите попытку.", Toast.LENGTH_LONG).show()
            }
        }

        textViewLogin.setOnClickListener {
            finish()
        }
    }

    private fun validateInput(login: String, password: String): Boolean {
        return login.isNotBlank() && password.length >= 4 && !login.contains(" ") && !password.contains(" ")
    }
}
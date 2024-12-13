package com.example.myapplication1

import android.content.Intent
import android.os.Bundle

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AuthorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)


        val textViewRegister: TextView = findViewById(R.id.textViewRegister)

        textViewRegister.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
//535335
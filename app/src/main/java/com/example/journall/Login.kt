package com.example.journall

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val Pendaftaran = findViewById<TextView>(R.id.tv_sign)
        val forgot = findViewById<TextView>(R.id.tv_forget)

        Pendaftaran.setOnClickListener{
            intent = Intent(this@Login, Register::class.java)
            startActivity(intent)
        }
        forgot.setOnClickListener {
            intent = Intent(this@Login, forgotPassword::class.java)
            startActivity(intent)
        }

    }


}
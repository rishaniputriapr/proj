package com.example.journall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val returnBtnregis = findViewById<ImageButton>(R.id.btn_return)
        returnBtnregis.setOnClickListener {
            finish()
        }
    }
}
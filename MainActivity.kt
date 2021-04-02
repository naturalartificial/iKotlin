package com.example.registertestone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registerButton=findViewById<Button>(R.id.registerButton)
        registerButton.setOnClickListener {
            val Intent=Intent(this,RegistrationLayout::class.java)
            startActivity(Intent)
        }
    }
}
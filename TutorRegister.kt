package com.example.registertestone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TutorRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutor_register)

        val nexttutorInfo=findViewById<Button>(R.id.nexttutorInfo)
        nexttutorInfo.setOnClickListener {
            val Intent=Intent(this,TutorRegisterTwo::class.java)
            startActivity(Intent)
        }

    }
}
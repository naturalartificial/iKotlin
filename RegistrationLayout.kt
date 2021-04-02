package com.example.registertestone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegistrationLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_layout)

        val studentRegisterButton=findViewById<Button>(R.id.studentRegisterButton)
        studentRegisterButton.setOnClickListener {
            val Intent=Intent(this,StudentRegister::class.java)
            startActivity(Intent)

        }

        val tutorRegisterButton=findViewById<Button>(R.id.tutorRegisterButton)
        tutorRegisterButton.setOnClickListener {
            val Intent = Intent(this, TutorRegister::class.java)
            startActivity(Intent)
        }
    }
}
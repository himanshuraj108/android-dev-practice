package com.example.aclass

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_form)

        var registerBottom: Button = findViewById(R.id.register)
        var resetButton: Button = findViewById(R.id.reset)

        registerBottom.setOnClickListener {
            Toast.makeText(this,"Register Success", Toast.LENGTH_LONG).show()
        }

        resetButton.setOnClickListener {
            Toast.makeText(this,"Reset Success",Toast.LENGTH_LONG).show()
        }
    }
}
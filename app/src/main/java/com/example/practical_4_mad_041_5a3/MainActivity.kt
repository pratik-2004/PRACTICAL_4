package com.example.practical_4_mad_041_5a3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbutton = findViewById<Button>(R.id.button1)
        val signupbutton = findViewById<Button>(R.id.button2)

        loginbutton.setOnClickListener(){
            Intent(this@MainActivity, MainActivity2::class.java).also { startActivity(it) }
        }

        signupbutton.setOnClickListener(){
            Intent(this@MainActivity, MainActivity3::class.java).also { startActivity(it) }
        }
    }

}
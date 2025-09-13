package com.muhammadahsan.i230553

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class beforeloginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beforelogin)

        var signup = findViewById<TextView>(R.id.sign_up)
        signup.setOnClickListener {
            var intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

        var login = findViewById<Button>(R.id.log_in)
        login.setOnClickListener {
            var intent = Intent(this, mainFeedActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
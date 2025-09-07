package com.muhammadahsan.i230553

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class beforeloginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_beforelogin)

        var signup = findViewById<TextView>(R.id.sign_up)
        signup.setOnClickListener {
            var intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

    }
}
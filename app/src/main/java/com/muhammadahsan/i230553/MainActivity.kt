package com.muhammadahsan.i230553

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        Handler().postDelayed({
            var intent = Intent(this,beforeloginActivity::class.java)
            startActivity(intent)
            finish()
        }, 1500)




    }
}


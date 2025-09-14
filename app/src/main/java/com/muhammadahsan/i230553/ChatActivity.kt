package com.muhammadahsan.i230553

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chat)

        var video_call = findViewById<android.widget.ImageView>(R.id.video_call)
        var back_arrow = findViewById<android.widget.ImageView>(R.id.back_arrow)




        back_arrow.setOnClickListener {
            finish()
        }


        video_call.setOnClickListener {
            startActivity(android.content.Intent(this, CallActivity::class.java))
        }


    }
}
package com.muhammadahsan.i230553

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mainFeedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_feed)


        var story_btn = findViewById<ImageView>(R.id.add_story_icon)
        story_btn.setOnClickListener {
            var intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }

    }
}
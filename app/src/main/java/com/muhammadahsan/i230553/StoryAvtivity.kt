package com.muhammadahsan.i230553

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StoryAvtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_story_avtivity)

        var close_button = findViewById<android.widget.ImageView>(R.id.close_button)
        close_button.setOnClickListener {
            finish()
        }

        var next = findViewById<Button>(R.id.next)
        next.setOnClickListener {
            startActivity(android.content.Intent(this, FinalStoryActivity::class.java))
        }

    }
}
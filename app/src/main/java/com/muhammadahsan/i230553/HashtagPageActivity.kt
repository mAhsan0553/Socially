package com.muhammadahsan.i230553

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HashtagPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hashtag_page)

        var cross = findViewById<android.widget.ImageView>(R.id.cross)
        cross.setOnClickListener {
            finish()
        }

        var clear = findViewById<android.widget.TextView>(R.id.clear)
        clear.setOnClickListener {
            finish()
        }



    }
}
package com.muhammadahsan.i230553

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProfilePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_page)

        var search_btn = findViewById<ImageView>(R.id.search_button)
        search_btn.setOnClickListener {
            var intent = Intent(this, SearchPageActivity::class.java)
            startActivity(intent)
        }
        var likes = findViewById<ImageView>(R.id.likes)
        likes.setOnClickListener {
            var intent = Intent(this, YouNotificationsActivity::class.java)
            startActivity(intent)

        }

        var add_post_btn = findViewById<ImageView>(R.id.add_post_btn)
        add_post_btn.setOnClickListener {
            //create an implicit intent to open the gallery app
            var intent = android.content.Intent("android.intent.action.PICK")
            intent.type = "image/*"
            startActivity(intent)
        }
        var home_btn = findViewById<ImageView>(R.id.home_button)
        home_btn.setOnClickListener {
            var intent = Intent(this, mainFeedActivity::class.java)
            startActivity(intent)
        }

    }
}
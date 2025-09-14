package com.muhammadahsan.i230553

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SearchPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_search_page)

        var likes = findViewById<ImageView>(R.id.likes)
        likes.setOnClickListener {
            var intent = android.content.Intent(this, YouNotificationsActivity::class.java)
            startActivity(intent)

        }

        var home = findViewById<ImageView>(R.id.home_button)
        home.setOnClickListener {
            var intent = android.content.Intent(this, mainFeedActivity::class.java)
            startActivity(intent)
            finish()

        }

        var add_post_btn = findViewById<ImageView>(R.id.add_post_btn)
        add_post_btn.setOnClickListener {
            //create an implicit intent to open the gallery app
            var intent = android.content.Intent("android.intent.action.PICK")
            intent.type = "image/*"
            startActivity(intent)
        }

        var hashtags = findViewById<LinearLayout>(R.id.search_bar_layout_inner)
        hashtags.setOnClickListener {
            var intent = android.content.Intent(this, HashtagPageActivity::class.java)
            startActivity(intent)
        }

    }
}
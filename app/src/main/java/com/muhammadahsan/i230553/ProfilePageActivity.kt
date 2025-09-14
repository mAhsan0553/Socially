package com.muhammadahsan.i230553

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
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

        var btn6 = findViewById<ImageView>(R.id.hl1)
        btn6.setOnClickListener {
            var intent = Intent(this, HighlightActivity::class.java)
            startActivity(intent)
        }


        var btn7 = findViewById<ImageView>(R.id.hl2)
        btn7.setOnClickListener {
            var intent = Intent(this, HighlightActivity::class.java)
            startActivity(intent)
        }

        var btn8 = findViewById<ImageView>(R.id.hl3)
        btn8.setOnClickListener {
            var intent = Intent(this, HighlightActivity::class.java)
            startActivity(intent)
        }


        var btn5 = findViewById<TextView>(R.id.EditProfile)
        btn5.setOnClickListener {
            var intent = Intent(this, EditProfileActivity::class.java)
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
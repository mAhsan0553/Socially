package com.muhammadahsan.i230553

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FollowingNotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_following_notification)

        var tvyou = findViewById<android.widget.TextView>(R.id.tvYou)
        tvyou.setOnClickListener {
            var intent = android.content.Intent(this, YouNotificationsActivity::class.java)
            startActivity(intent)
            finish()
        }
        var home = findViewById<android.widget.ImageView>(R.id.home_button)
        home.setOnClickListener {
            var intent = android.content.Intent(this, mainFeedActivity::class.java)
            startActivity(intent)
            finish()
        }
        var search = findViewById<android.widget.ImageView>(R.id.search_button)
        search.setOnClickListener {
            var intent = android.content.Intent(this, SearchPageActivity::class.java)
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

        var profile = findViewById<android.widget.ImageView>(R.id.my_account)
        profile.setOnClickListener {
            var intent = android.content.Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
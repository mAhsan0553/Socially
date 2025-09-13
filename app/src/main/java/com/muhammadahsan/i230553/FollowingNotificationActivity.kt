package com.muhammadahsan.i230553

import android.os.Bundle
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
    }
}
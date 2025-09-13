package com.muhammadahsan.i230553

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class YouNotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_you_notifications)


        var following = findViewById<TextView>(R.id.tvFollowing)
        following.setOnClickListener {
            var intent = android.content.Intent(this, FollowingNotificationActivity::class.java)
            startActivity(intent)

        }
        var home = findViewById<ImageView>(R.id.home_button)
        home.setOnClickListener {
            var intent = android.content.Intent(this, mainFeedActivity::class.java)
            startActivity(intent)
            finish()
        }
        var search = findViewById<ImageView>(R.id.search_button)
        search.setOnClickListener {
            var intent = android.content.Intent(this, SearchPageActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
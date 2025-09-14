package com.muhammadahsan.i230553

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
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
        story_btn.setOnClickListener{
            //create an implicit intent to open the camera app
            var intent = Intent("android.media.action.IMAGE_CAPTURE")
            startActivity(intent)
        }

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

        var profile = findViewById<android.widget.ImageView>(R.id.my_account)
        profile.setOnClickListener {
            var intent = android.content.Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        }

        var messages_btn = findViewById<ImageView>(R.id.messages)
        messages_btn.setOnClickListener {
            var intent = Intent(this, MessagesActivity::class.java)
            startActivity(intent)
        }



        var friendprofile = findViewById<RelativeLayout>(R.id.joshua_ki_post_name_n_id)
        friendprofile.setOnClickListener {
            var intent = android.content.Intent(this, FriendProfileActivity::class.java)
            startActivity(intent)
        }

        var firendprofile2 = findViewById<RelativeLayout>(R.id.joshua_ki_post_name_n_id2)
        firendprofile2.setOnClickListener {
            var intent = android.content.Intent(this, FriendProfileActivity::class.java)
            startActivity(intent)
        }

    }
}
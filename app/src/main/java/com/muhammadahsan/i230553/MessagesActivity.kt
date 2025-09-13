package com.muhammadahsan.i230553

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MessagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_messages)

        var backButton = findViewById<ImageView>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        var dropdownIcon = findViewById<ImageView>(R.id.dropdownIcon)
        dropdownIcon.setOnClickListener {
            var intent = android.content.Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
        var headerTitle = findViewById<TextView>(R.id.headerTitle)
        headerTitle.setOnClickListener {
            var intent = android.content.Intent(this, loginActivity::class.java)
            startActivity(intent)
        }

        var cameracontainer = findViewById<LinearLayout>(R.id.cameraContainer)
        cameracontainer.setOnClickListener {
            //create an implicit intent to open the gallery app
            var intent = android.content.Intent("android.intent.action.PICK")
            intent.type = "image/*"
            startActivity(intent)
        }

    }
}
package com.muhammadahsan.i230553

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)

        var btnCancel = findViewById<TextView>(R.id.cancel_btn)
        btnCancel.setOnClickListener {
            finish()
        }

        var btnSave = findViewById<TextView>(R.id.done_btn)
        btnSave.setOnClickListener {
            finish()
        }

    }
}
package com.muhammadahsan.i230553

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CreateAccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_account)

        var backarrow = findViewById<ImageView>(R.id.back_arrow)
        backarrow.setOnClickListener {
            finish()
        }

        var create_account_btn = findViewById<Button>(R.id.create_account_btn)
        create_account_btn.setOnClickListener {
            var intent = Intent(this, mainFeedActivity::class.java)
            startActivity(intent)
            finish()
        }

        var image=findViewById<ImageView>(R.id.image)
        //create an implicit intent to open galary app and selected image should be shown in image view
        image.setOnClickListener {
            var intent = Intent()
            intent.action = Intent.ACTION_GET_CONTENT
            intent.type = "image/*"
            startActivityForResult(intent, 100)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            val imageUri: Uri? = data.data
            val image = findViewById<ImageView>(R.id.image)
            image.setImageURI(imageUri)
        }
    }
}
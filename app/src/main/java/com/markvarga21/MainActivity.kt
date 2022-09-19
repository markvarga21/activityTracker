package com.markvarga21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        // If actionBar is not null set the title
        actionBar!!.title = "Activities"

        val button: Button = findViewById(R.id.addActivityButton)
        button.setOnClickListener {
            val intent = Intent(this, ActivityAdderActivity::class.java)
            startActivity(intent)
        }
    }
}
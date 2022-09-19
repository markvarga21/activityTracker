package com.markvarga21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityAdderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adder)

        val actionBar = supportActionBar
        // If actionBar is not null set the title
        actionBar!!.title = "Add new activity"

        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}
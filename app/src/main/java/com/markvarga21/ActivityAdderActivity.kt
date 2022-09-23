package com.markvarga21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.markvarga21.databinding.ActivityAdderBinding
import com.markvarga21.databinding.ActivityMainBinding

class ActivityAdderActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAdderBinding
    private lateinit var activityArrayList : ArrayList<SportActivity>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adder)

        val actionBar = supportActionBar
        // If actionBar is not null set the title
        actionBar!!.title = "Add new activity"

        actionBar.setDisplayHomeAsUpEnabled(true)

        val imageId = intArrayOf(
            R.drawable.running, R.drawable.baseball, R.drawable.basketball,
            R.drawable.box, R.drawable.football, R.drawable.tennis,
            R.drawable.yoga
        )

        val name = arrayOf("Running", "Baseball", "Basketball", "Box", "Football", "Tennis", "Yoga")
        val units = arrayOf("km", "minutes", "minutes", "steps", "hits", "km", "jumps")
        val kcal = arrayOf("100", "200", "300", "400", "500", "600", "700", "800", "150")
        val joule = arrayOf("12500", "10000", "9200", "5600", "8000", "13200", "11300", "4500", "7300")

        activityArrayList = ArrayList()

        for (i in name.indices) {
            val activity = SportActivity(name[i], imageId[i], units[i], kcal[i].toInt(), joule[i].toInt())
            activityArrayList.add(activity)
        }

        binding.activityList.isClickable = true
        binding.activityList.adapter = ActivityAdapter(this, activityArrayList)
        

    }
}
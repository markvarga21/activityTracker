package com.markvarga21

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class ActivityAdapter(
    private val context : Activity,
    private val arrayList : ArrayList<SportActivity>
    ) : ArrayAdapter<SportActivity>(context, R.layout.activity_list_item, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context);
        val view : View = inflater.inflate(R.layout.activity_list_item, null)

        val imageView : ImageView = view.findViewById(R.id.activityPicture)
        val activityName : TextView = view.findViewById(R.id.activityName)
        val activityKcal : TextView = view.findViewById(R.id.activityKcalAmount)
        val activityJoule : TextView = view.findViewById(R.id.activityJouleAmount)
        val activityPerUnit : TextView = view.findViewById(R.id.activityPerUnit)

        imageView.setImageResource(arrayList[position].imageId)
        activityName.text = arrayList[position].name
        activityKcal.text = arrayList[position].caloriesPerUnit.toString()
        activityJoule.text = arrayList[position].joulesPerUnit.toString()
        activityPerUnit.text = arrayList[position].unityType

        return view
    }
}
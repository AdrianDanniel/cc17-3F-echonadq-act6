package com.example.aboutme.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.about.R
import com.example.aboutme.model.AboutMe



class AboutMeAdapter(val data: List<AboutMe>):
    RecyclerView.Adapter<AboutMeAdapter.AboutMeItemViewHolder>(){

    class AboutMeItemViewHolder(val row: View): RecyclerView.ViewHolder(row){
        val aboutMeImageView = row.findViewById<ImageView>(R.id.pic)
        val aboutMedayTextView = row.findViewById<TextView>(R.id.day)
        val aboutMedescTextView = row.findViewById<TextView>(R.id.desc)
        val aboutMetitleTextView = row.findViewById<TextView>(R.id.title)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutMeItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.view, parent, false)
        return AboutMeItemViewHolder(layout)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: AboutMeItemViewHolder, position: Int) {
        holder.aboutMeImageView.setImageResource(data.get(position).pic)
        holder.aboutMedayTextView.text = data.get(position).day
        holder.aboutMedescTextView.text = data.get(position).desc
        holder.aboutMetitleTextView.text = data.get(position).title

    }

}
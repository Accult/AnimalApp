package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalsAdapter(
    var animals: ArrayList<Animals>,
    var context: Context
) : RecyclerView.Adapter<AnimalsAdapter.AnimalViewHolder>() {

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        var imageView : ImageView = itemView.findViewById(R.id.imageAnimal)
        var button : Button = itemView.findViewById(R.id.buttonDetails)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.animal_section,parent,false)

        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {

        holder.imageView.setImageResource(animals.get(position).picture)

        holder.button.setOnClickListener{

            var passingName = animals.get(position).name
            var passingDescription = animals.get(position).description

            var intent = Intent(context,FirstActivity::class.java)

            intent.putExtra("passingName", passingName)
            intent.putExtra("passingDescription", passingDescription)

            context.startActivity(intent)

        }
    }
}
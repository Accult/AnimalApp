package com.example.myapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    lateinit var fullDescription: TextView
    lateinit var nameOfAnimal: TextView
    lateinit var photo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        nameOfAnimal = findViewById(R.id.tv_name)
        photo = findViewById(R.id.tv_photo)
        fullDescription = findViewById(R.id.tv_description)

        val passingName = intent.getStringExtra("passingName")
        val passingDescription = intent.getStringExtra("passingDescription")

        when (passingName) {
            "Adolf" -> photo.setImageResource(R.drawable.adolf)
            "Tom" -> photo.setImageResource(R.drawable.tom)
            "Freddy" -> photo.setImageResource(R.drawable.freddy)
        }


        nameOfAnimal.text = passingName

        fullDescription.text = passingDescription

    }
}
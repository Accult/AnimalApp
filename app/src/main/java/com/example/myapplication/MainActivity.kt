package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    var animals = ArrayList<Animals>()

    lateinit var adapter: AnimalsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rV)

        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        var adolf = Animals(
            "Adolf",
            "Temperament: demanding cat(*information from the owner), \nColors: black and white, \nSkills: damage your favorite shoes ",
            R.drawable.logo_cat_first,
            R.drawable.adolf
        )
        var tom = Animals(
            "Tom",
            "Not the same one from Disney cartoon,\nColors: brown with white and black stripes, \nTemperament:intelligent and loving\n",
            R.drawable.logo_cat_first,
            R.drawable.tom
        )
        var freddy = Animals(
            "Freddy",
            "Little kitten, \nColors: light brown *medium rare:) \nHobbies: play with threads",
            R.drawable.logo_cat_first,
            R.drawable.freddy
        )



        animals.add(adolf)
        animals.add(freddy)
        animals.add(tom)


        adapter = AnimalsAdapter(animals, this@MainActivity)

        recyclerView.adapter = adapter

    }
}

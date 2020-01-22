package com.espresso.example

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class FruitsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_fruits)

        // Find fruit list view
        val listView: ListView = findViewById(R.id.listView)

        // Initialize fruit data
        val fruits = arrayOf(
            "Apple",
            "Banana",
            "Cherry",
            "Dates",
            "Elderberry",
            "Fig",
            "Grapes",
            "Grapefruit",
            "Guava",
            "Jack fruit",
            "Lemon",
            "Mango",
            "Orange",
            "Papaya",
            "Pears",
            "Peaches",
            "Pineapple",
            "Plums",
            "Raspberry",
            "Strawberry",
            "Watermelon"
        )

        // Create array list of fruits
        val fruitList = ArrayList<String>()
        for (element in fruits) {
            fruitList.add(element)
        }

        // Create Array adapter
        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this, R.layout.fruit_item,
            fruitList as List<String>
        )

        // Set adapter in list view
        listView.adapter = adapter
    }
}
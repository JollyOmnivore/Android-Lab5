package com.example.lab5
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
//import Fruit

private lateinit var listView: ListView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.itemFruitList)
        val adapter = ArrayAdapter(
            applicationContext,
            android.R.layout.simple_expandable_list_item_1,
            Fruit.fruit
        )
        listView.adapter = adapter




        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Fruit.fruit.removeAt(position)
            adapter.notifyDataSetChanged()

        }

    }
}
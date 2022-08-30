package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    // class variables
    private lateinit var  binding: ActivityMainBinding

    // Log tag
    private val TAG = "Main Acticity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // not using this to set the content view because using bindings
        // setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Getting the DataSource and making the list of the Affirmations for use
        val dataItems = Datasource().loadAffirmations()

        // setting up to use the ItemAdapter for the RecyclerView
        val itemAdapter = ItemAdapter(context = this, dataset = dataItems)

        // this lets the recyclerView know that the items will not change the
        // size of the recyclerView as it is scrolled.
        // This helps them improve the performance of the recyclerView
        binding.recyclerView.setHasFixedSize(true)

        // setting the adapter
        binding.recyclerView.adapter = itemAdapter


    }
}
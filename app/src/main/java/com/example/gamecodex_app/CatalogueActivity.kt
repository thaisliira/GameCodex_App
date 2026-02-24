package com.example.gamecodex_app

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.gamecodex_app.databinding.ActivityCatalogueBinding

class CatalogueActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityCatalogueBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var arrayListCatalogue = ArrayList<Game>()
        arrayListCatalogue.add(Game("Pokemon", "RPG", 38.99, 2026, 12, 3.0))


        var arrayAdapterCatalogue =
            ArrayAdapter(this, R.layout.simple_list_item_1, arrayListCatalogue)

        binding.listCatalogue.adapter = arrayAdapterCatalogue


    }
}
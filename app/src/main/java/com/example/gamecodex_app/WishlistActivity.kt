package com.example.gamecodex_app

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.gamecodex_app.databinding.ActivityWishlistBinding

class WishlistActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWishlistBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val arrayListCatalogue = ArrayList<Game>()

        arrayListCatalogue.add(Game("Pokemon Scarlet", "RPG", 59.99, 2022, 12, 0.5))
        arrayListCatalogue.add(Game("Elden Ring", "Ação/RPG", 69.90, 2022, 16, 0.6))
        arrayListCatalogue.add(Game("Super Mario Odyssey", "Plataforma", 45.00, 2017, 3, 0.4))
        arrayListCatalogue.add(Game("God of War Ragnarok", "Ação", 79.99, 2022, 18, 0.8))
        arrayListCatalogue.add(Game("FIFA 23", "Desporto", 69.99, 2022, 3, 0.3))
        arrayListCatalogue.add(Game("The Last of Us Part II", "Aventura", 39.90, 2020, 18, 0.7))
        arrayListCatalogue.add(Game("Stray", "Aventura", 29.99, 2022, 12, 0.2))
        arrayListCatalogue.add(Game("Minecraft", "Sandbox", 25.00, 2011, 7, 0.1))
        arrayListCatalogue.add(Game("Cyberpunk 2077", "RPG", 49.99, 2020, 18, 0.6))
        arrayListCatalogue.add(Game("Animal Crossing", "Simulação", 50.00, 2020, 3, 0.4))
        arrayListCatalogue.add(Game("Hades", "Indie/Roguelike", 24.99, 2020, 12, 0.2))
        arrayListCatalogue.add(Game("Call of Duty: MWII", "FPS", 75.00, 2022, 18, 0.9))
        arrayListCatalogue.add(Game("The Witcher 3", "RPG", 30.00, 2015, 18, 0.7))
        arrayListCatalogue.add(Game("Tetris Effect", "Puzzle", 19.99, 2018, 3, 0.1))
        arrayListCatalogue.add(Game("Zelda: Breath of the Wild", "Aventura", 60.00, 2017, 12, 0.5))


        var arrayAdapterCatalogue =
            ArrayAdapter(this, R.layout.item_game, arrayListCatalogue)

        binding.listCatalogue.adapter = arrayAdapterCatalogue


    }
}
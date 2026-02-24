package com.example.gamecodex_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gamecodex_app.databinding.ActivityWishlistBinding

class WishlistActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWishlistBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

}
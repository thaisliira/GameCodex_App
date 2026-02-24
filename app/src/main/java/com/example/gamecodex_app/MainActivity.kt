package com.example.gamecodex_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gamecodex_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val arrayLoginsValidos = ArrayList<Login>()
        arrayLoginsValidos.add(Login("admin", "123456", "Administrador", "1990"))
        arrayLoginsValidos.add(Login("user1", "pass1", "João Silva", "2005"))



    }
}


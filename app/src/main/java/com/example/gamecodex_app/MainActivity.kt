package com.example.gamecodex_app

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
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
        arrayLoginsValidos.add(Login("admin", "123456", "Administrador", 1990))
        arrayLoginsValidos.add(Login("thais", "pass1", "Thais Lira", 1993))
        arrayLoginsValidos.add(Login("maria", "pass2", "Maria Madalena", 2010))
        arrayLoginsValidos.add(Login("joana", "pass3", "Joana Dark", 2005))
        arrayLoginsValidos.add(Login("leo", "pass4", "Leonardo Aguiar", 1999))

        binding.buttonLogin.setOnClickListener {
            val userIn = binding.editUsername.text.toString()
            val passIn = binding.editPassword.text.toString()

            var userEncontrado: Login? = null

            for (u in arrayLoginsValidos) {
                if (u.username == userIn && u.password == passIn) {
                    userEncontrado = u
                    break
                }
            }

            if (userEncontrado != null) {
                val intent = Intent(this, WishlistActivity::class.java)

                intent.putExtra("NOME_USER", userEncontrado.name)
                intent.putExtra("ANO_NASC", userEncontrado.birthday)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Login not valid, try again!", Toast.LENGTH_SHORT).show()
                binding.editUsername.text.clear()
                binding.editPassword.text.clear()
            }
        }
    }
}

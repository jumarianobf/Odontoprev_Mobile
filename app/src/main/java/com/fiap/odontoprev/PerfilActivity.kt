package com.fiap.odontoprev

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_activity)

        val homeView: ImageView = findViewById(R.id.imageView2)

        val emailTextView: TextView = findViewById(R.id.textViewEmail)

        val sharedPreferences = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val userEmail = sharedPreferences.getString("email", "Email não encontrado")

        val userName = userEmail?.substringBefore("@") ?: "Nome não encontrado"

        val nameTextView: TextView = findViewById(R.id.textViewNome)

        emailTextView.text = userEmail
        nameTextView.text = userName

        emailTextView.text = userEmail

        homeView.setOnClickListener {

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val perrotView: ImageView = findViewById(R.id.imageView3)

        perrotView.setOnClickListener {

            val intent = Intent(this, PerrotActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}

package com.fiap.odontoprev

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PerrotActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perrot_activity)


        val homeView: ImageButton = findViewById(R.id.menu)

        homeView.setOnClickListener {

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val profileView: ImageButton = findViewById(R.id.perfil)

        profileView.setOnClickListener {

            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}


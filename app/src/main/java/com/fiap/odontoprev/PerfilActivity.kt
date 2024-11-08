package com.fiap.odontoprev

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.perfil_activity)

        val homeView: ImageButton = findViewById(R.id.view16)

        homeView.setOnClickListener {

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        val perrotView: ImageButton = findViewById(R.id.view17)

        perrotView.setOnClickListener {

            val intent = Intent(this, PerrotActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}

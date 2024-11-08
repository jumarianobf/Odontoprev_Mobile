package com.fiap.odontoprev

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val loginButton: Button = findViewById(R.id.login_button)
        loginButton.setOnClickListener {
            val emailInput = findViewById<EditText>(R.id.email_input).text.toString()
            val passwordInput = findViewById<EditText>(R.id.password_input).text.toString()

            authenticateUser(emailInput, passwordInput)
        }

        val cadastreButton: Button = findViewById(R.id.textView6)
        cadastreButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun authenticateUser(email: String, password: String) {
        // Recupera as credenciais armazenadas
        val sharedPreferences = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val storedEmail = sharedPreferences.getString("email", null)
        val storedPassword = sharedPreferences.getString("password", null)

        if (email == storedEmail && password == storedPassword) {
            val editor = sharedPreferences.edit()
            editor.putString("user_email", email)
            editor.apply()

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            showError("Credenciais inválidas")
        }
    }

    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

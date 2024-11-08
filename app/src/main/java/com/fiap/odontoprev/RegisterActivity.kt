package com.fiap.odontoprev

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastro_activity)

        val registerButton: Button = findViewById(R.id.cadastro)
        registerButton.setOnClickListener {
            val emailInput = findViewById<EditText>(R.id.email_input).text.toString()
            val passwordInput = findViewById<EditText>(R.id.password_input).text.toString()

            if (emailInput.isNotEmpty() && passwordInput.isNotEmpty()) {
                registerUser(emailInput, passwordInput)
            } else {
                showError("Preencha todos os campos!")
            }
        }

        val backToLoginButton: Button = findViewById(R.id.textView6)
        backToLoginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun registerUser(email: String, password: String) {

        val sharedPreferences = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()


        editor.putString("email", email)
        editor.putString("password", password)
        editor.apply()


        Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

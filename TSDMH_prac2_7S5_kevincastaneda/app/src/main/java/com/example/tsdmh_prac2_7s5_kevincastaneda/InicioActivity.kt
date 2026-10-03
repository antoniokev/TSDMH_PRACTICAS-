package com.example.tsdmh_prac2_7s5_kevincastaneda

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inicio)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        btnSaludar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            if (nombre.isNotEmpty()) {
                val mensaje = getString(R.string.greeting_format, nombre)
                Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, getString(R.string.empty_name_error), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
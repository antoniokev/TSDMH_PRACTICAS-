package com.example.tsdmh_prac3_kevincastaneda

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString()
            
            if (nombre.isNotEmpty()) {
                mostrarMensaje(nombre)
            } else {
                etNombre.error = "Por favor ingresa tu nombre"
            }
        }
    }

    private fun mostrarMensaje(nombre: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(getString(R.string.app_name))
        builder.setMessage(getString(R.string.mensaje_bienvenida, nombre))
        builder.setPositiveButton(getString(R.string.boton_aceptar)) { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }
}

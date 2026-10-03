package com.example.tsdmh_7s5_prac4_kevincastaneda;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecibeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recibe);

        TextView textViewNombreRecibido = findViewById(R.id.textViewNombreRecibido);

        // Obtener el nombre enviado desde la actividad anterior
        String nombre = getIntent().getStringExtra("nombre_usuario");

        if (nombre != null && !nombre.isEmpty()) {
            textViewNombreRecibido.setText(nombre);
        } else {
            textViewNombreRecibido.setText(R.string.no_nombre);
        }
    }
}
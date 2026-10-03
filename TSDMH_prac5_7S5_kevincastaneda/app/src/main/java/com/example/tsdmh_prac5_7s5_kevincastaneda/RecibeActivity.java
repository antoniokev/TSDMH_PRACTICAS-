package com.example.tsdmh_prac5_7s5_kevincastaneda;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecibeActivity extends AppCompatActivity {

    private TextView tvNombreRecibido, tvEdadRecibida, tvEstadoEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recibe);

        tvNombreRecibido = findViewById(R.id.tvNombreRecibido);
        tvEdadRecibida = findViewById(R.id.tvEdadRecibida);
        tvEstadoEdad = findViewById(R.id.tvEstadoEdad);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nombre = extras.getString("nombre");
            String edadStr = extras.getString("edad");

            tvNombreRecibido.setText(getString(R.string.nombre_formato, nombre));
            tvEdadRecibida.setText(getString(R.string.edad_formato, edadStr));

            try {
                int edad = Integer.parseInt(edadStr);
                String estado;
                if (edad >= 18) {
                    estado = getString(R.string.mayor_edad);
                } else {
                    estado = getString(R.string.menor_edad);
                }
                tvEstadoEdad.setText(getString(R.string.estado_formato, estado));
            } catch (NumberFormatException e) {
                tvEstadoEdad.setText(getString(R.string.estado_formato, getString(R.string.edad_no_valida)));
            }
        }
    }
}
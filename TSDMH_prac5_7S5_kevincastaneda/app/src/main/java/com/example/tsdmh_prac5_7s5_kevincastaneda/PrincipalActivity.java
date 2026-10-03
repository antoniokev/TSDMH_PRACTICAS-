package com.example.tsdmh_prac5_7s5_kevincastaneda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    private EditText etNombre, etEdad;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                String edadStr = etEdad.getText().toString();

                if (!nombre.isEmpty() && !edadStr.isEmpty()) {
                    Intent intent = new Intent(PrincipalActivity.this, RecibeActivity.class);
                    intent.putExtra("nombre", nombre);
                    intent.putExtra("edad", edadStr);
                    startActivity(intent);
                }
            }
        });
    }
}
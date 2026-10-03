package com.example.tsdmh_7s5_prac4_kevincastaneda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    private EditText editTextNombre;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        editTextNombre = findViewById(R.id.editTextNombre);
        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                Intent intent = new Intent(PrincipalActivity.this, RecibeActivity.class);
                intent.putExtra("nombre_usuario", nombre);
                startActivity(intent);
            }
        });
    }
}
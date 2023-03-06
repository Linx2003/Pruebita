package com.example.taller3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Persona persona;
    private static final int CALIFICACION = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        persona = (Persona) getIntent().getSerializableExtra("persona");

        TextView detallesTextView = findViewById(R.id.codigo_texto);
        detallesTextView.setText(persona.getCodigo());
        TextView detalles = findViewById(R.id.correo_texto);
        detalles.setText(persona.getCorreo());
        TextView calificacion = findViewById(R.id.testo_3);
        calificacion.setText("" + CALIFICACION);

    }
}
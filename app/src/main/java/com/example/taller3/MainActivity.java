package com.example.taller3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText codigoEditText;
    private EditText correoEditText;
    private Persona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codigoEditText = findViewById(R.id.codigo);
        correoEditText = findViewById(R.id.correo);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String codigo = codigoEditText.getText().toString();
                String correo = correoEditText.getText().toString();
                persona = new Persona(codigo, correo);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("persona", persona);
                startActivity(intent);
            }
        });
    }
}
package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Peso extends AppCompatActivity {
    private EditText campoKilogramo;
    private Button botonLibras;
    private Button botonOnzas;
    private TextView textoSalidap;
    private Button botonvolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        campoKilogramo = (EditText) findViewById(R.id.txtpeso);
        botonLibras =(Button) findViewById(R.id.btnlibras);
        botonOnzas=(Button) findViewById(R.id.btnonzas);
        textoSalidap=(TextView) findViewById(R.id.txtSalidap);
        botonvolver = (Button)findViewById(R.id.btnvolver);

        botonLibras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplicador = 2.205;
                double resultado = 0;

                if (campoKilogramo.getText().toString().equals("")){
                    textoSalidap.setText(R.string.mensaje_error);
                }else {
                    double valorKilo = Double.parseDouble(campoKilogramo.getText().toString());
                    resultado = valorKilo * multiplicador;

                    //textoSalida.setText(Double.toString(resultado));
                    textoSalidap.setText(String.format("%.3f", resultado));
                }

            }

        });
        botonOnzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplicador = 35.274;
                double resultado = 0;

                if (campoKilogramo.getText().toString().equals("")){
                    textoSalidap.setText(R.string.mensaje_error);
                }else {
                    double valorKilo = Double.parseDouble(campoKilogramo.getText().toString());
                    resultado = valorKilo * multiplicador;

                    //textoSalida.setText(Double.toString(resultado));
                    textoSalidap.setText(String.format("%.3f", resultado));
                }

            }
        });
        botonvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
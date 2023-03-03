package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class temperatura extends AppCompatActivity {
    private EditText campoCelsius;
    private Button botonFahren;
    private Button botonKelvin;
    private TextView textoSalidat;
    private Button botonvolvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        campoCelsius = (EditText) findViewById(R.id.txtcelsius);
        botonFahren =(Button) findViewById(R.id.btnfahrenheit);
        botonKelvin=(Button) findViewById(R.id.btnkelvin);
        textoSalidat=(TextView) findViewById(R.id.txtSalidat);
        botonvolvert=(Button) findViewById(R.id.btnvolvert);

        botonFahren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplicador =  9/5;
                double suma = 32;
                double resultado = 0;

                if (campoCelsius.getText().toString().equals("")){
                    textoSalidat.setText(R.string.mensaje_error);
                }else {
                    double valorCelsius = Double.parseDouble(campoCelsius.getText().toString());
                    resultado = valorCelsius * multiplicador + suma;

                    //textoSalida.setText(Double.toString(resultado));
                    textoSalidat.setText(String.format("%.3f", resultado));
                }

            }

        });
        botonKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double suma = 273.15;
                double resultado = 0;

                if (campoCelsius.getText().toString().equals("")){
                    textoSalidat.setText(R.string.mensaje_error);
                }else {
                    double valorCelsius = Double.parseDouble(campoCelsius.getText().toString());
                    resultado = valorCelsius + suma;

                    //textoSalida.setText(Double.toString(resultado));
                    textoSalidat.setText(String.format("%.3f", resultado));
                }

            }
        });
        botonvolvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
            }
        });
    }
}
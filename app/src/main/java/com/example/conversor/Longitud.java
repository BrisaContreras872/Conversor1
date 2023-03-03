package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Longitud extends AppCompatActivity {
    private EditText campoMetros;
    private Button botonCentimetros;
    private Button botonkilometros;
    private TextView textoSalida;
    private Button volverl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);
        campoMetros = (EditText) findViewById(R.id.txtmetros);
        botonCentimetros =(Button) findViewById(R.id.btncentimetros);
        botonkilometros=(Button) findViewById(R.id.btnkilometros);
        textoSalida=(TextView) findViewById(R.id.txtSalida);
        volverl=(Button)findViewById(R.id.btnvolverl);

        botonCentimetros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplicador = 100;
                double resultado = 0;

                if (campoMetros.getText().toString().equals("")){
                    textoSalida.setText(R.string.mensaje_error);
                }else {
                    double valorMetros = Double.parseDouble(campoMetros.getText().toString());
                    resultado = valorMetros * multiplicador;

                    //textoSalida.setText(Double.toString(resultado));
                    textoSalida.setText(String.format("%.2f", resultado));
                }

            }

        });
        botonkilometros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double multiplicador = 0.001;
                double resultado = 0;

                if (campoMetros.getText().toString().equals("")){
                    textoSalida.setText(R.string.mensaje_error);
                }else {
                    double valorMetros = Double.parseDouble(campoMetros.getText().toString());
                    resultado = valorMetros * multiplicador;

                    //textoSalida.setText(Double.toString(resultado));
                    textoSalida.setText(String.format("%.3f", resultado));
                }

            }
        });
        volverl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
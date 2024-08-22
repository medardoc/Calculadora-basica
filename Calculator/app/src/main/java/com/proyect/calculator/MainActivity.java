package com.proyect.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class    MainActivity extends AppCompatActivity {
    private EditText numero1;
    private EditText numero2;
    private Button botonSumar;
    private Button botonRestar;
    private Button botonMultiplicar;
    private Button botonDividir;
    private Button botonLimpiar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);

        botonSumar = findViewById(R.id.btnSumar);
        botonRestar = findViewById(R.id.btnRestar);
        botonMultiplicar = findViewById(R.id.btnMultiplicar);
        botonDividir = findViewById(R.id.btnDividir);
        botonLimpiar = findViewById(R.id.btnLimpiar);

        resultado =findViewById(R.id.resultado);

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = numero1.getText().toString();
                String valor2 = numero2.getText().toString();

                if(valor1.isEmpty() || valor2.isEmpty()){
                    resultado.setText("Por favor ingrese ambos números");
                }
                else{
                    Double num1 = Double.parseDouble(valor1);
                    Double num2 = Double.parseDouble(valor2);
                    Double suma = num1 + num2;
                    resultado.setText("El resultado es: "+ suma.toString());
                }
            }
        });
        // Configuración para el botón restar
        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = numero1.getText().toString();
                String valor2 = numero2.getText().toString();

                if(valor1.isEmpty() || valor2.isEmpty()){
                    resultado.setText("Por favor ingrese ambos números");
                }
                else{
                    Double num1 = Double.parseDouble(valor1);
                    Double num2 = Double.parseDouble(valor2);
                    Double rest = num1 - num2;
                    resultado.setText("El resultado es: "+ rest.toString());
                }
            }
        });
        // Configuración para el botón multiplicar
        botonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = numero1.getText().toString();
                String valor2 = numero2.getText().toString();

                if(valor1.isEmpty() || valor2.isEmpty()){
                    resultado.setText("Por favor ingrese ambos números");
                }
                else{
                    Double num1 = Double.parseDouble(valor1);
                    Double num2 = Double.parseDouble(valor2);
                    Double mult = num1 * num2;
                    resultado.setText("El resultado es: "+ mult.toString());
                }
            }
        });
        // Configuración para el botón dividir
        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = numero1.getText().toString();
                String valor2 = numero2.getText().toString();

                if(valor1.isEmpty() || valor2.isEmpty()){
                    resultado.setText("Por favor ingrese ambos números");
                }
                else{
                    Double num1 = Double.parseDouble(valor1);
                    Double num2 = Double.parseDouble(valor2);
                    Double div = num1 / num2;
                    resultado.setText("El resultado es: "+ div.toString());
                }
            }
        });
        // Configuración para el botón Limpiar
        botonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero1.setText("");
                numero2.setText("");
            }
        });
    }
}
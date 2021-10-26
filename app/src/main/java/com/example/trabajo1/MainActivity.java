package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campoTexto1,campoTexto2,campoNum1,campoNum2, campoNum3;
    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //captura de datos
        campoTexto1 = findViewById(R.id.nombre);
        campoTexto2 = findViewById(R.id.carrera);
        campoNum1 = findViewById(R.id.nota1);
        campoNum2 = findViewById(R.id.nota2);
        campoNum3 = findViewById(R.id.nota3);

    }

    public void siguienteVentana(View v){
        String nombre, carrera,nota1str,nota2str,nota3str;
        double nota1,nota2,nota3,promedio;

        nota1str = campoNum1.getText().toString();
        nota2str = campoNum2.getText().toString();
        nota3str = campoNum3.getText().toString();
        nombre = campoTexto1.getText().toString();
        carrera = campoTexto2.getText().toString();

        nota1 = Double.parseDouble(nota1str);
        nota2 = Double.parseDouble(nota2str);
        nota3 = Double.parseDouble(nota3str);



        //validacion
        if(nota1str.isEmpty() || nota2str.isEmpty() || nota3str.isEmpty()){


            Toast.makeText(this, "introduzca valores validos", Toast.LENGTH_LONG).show();
        }else{
            if(nota1<0 ||nota1>7 || nota2<0 ||nota2>7 || nota3<0 ||nota3>7){
                Toast.makeText(this, "introduzca valores entre 0.0 y 0.7", Toast.LENGTH_LONG).show();
            }else{
                promedio = (nota1+nota2+nota3)/3;

                Intent intent = new Intent(this, VentanaFinal.class);
                intent.putExtra("promedio",promedio);
                intent.putExtra("nombre",nombre);
                intent.putExtra("carrera",carrera);
                startActivity(intent);



            }
        }
    }



}
package com.example.trabajo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VentanaFinal extends AppCompatActivity {

    TextView estudiante,carrera,promedio;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_final);

        //nombre estudiante
        estudiante = findViewById(R.id.estudianteText);
        carrera  = findViewById(R.id.estudianteText);
        promedio = findViewById(R.id.resultadoPromedio);

        Intent intent = getIntent();


        String nombre = intent.getStringExtra("nombre");
        String carrera = intent.getStringExtra("carrera");
        double promedioNum = intent.getDoubleExtra("promedio",0);
        estudiante.setText(nombre+" estudiante de: "+carrera);

        //promedio
        promedio.setText(""+promedioNum);
    }

    public void finalVentana(View v){
        estudiante.setText("");
        promedio.setText("");





        finish();
    }
}
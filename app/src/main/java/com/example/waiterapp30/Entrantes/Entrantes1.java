package com.example.waiterapp30.Entrantes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waiterapp30.Entrantes.EDescripcion.EDescripcion1;
import com.example.waiterapp30.Entrantes.EDescripcion.EDescripcion2;
import com.example.waiterapp30.Entrantes.EDescripcion.EDescripcion3;
import com.example.waiterapp30.Entrantes.EDescripcion.EDescripcion4;
import com.example.waiterapp30.Entrantes.EDescripcion.EDescripcion5;
import com.example.waiterapp30.Entrantes.EDescripcion.EDescripcion6;
import com.example.waiterapp30.Entrantes.EDescripcion.EDescripcion7;
import com.example.waiterapp30.MenuC;
import com.example.waiterapp30.R;

public class Entrantes1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrantes1);
    }
    public void entrante(View view) {
        startActivity(new Intent(getApplicationContext(), EDescripcion1.class));
        finish();
    }
    public void entrante2(View view) {
        startActivity(new Intent(getApplicationContext(), EDescripcion2.class));
        finish();
    }
    public void entrante3(View view) {
        startActivity(new Intent(getApplicationContext(), EDescripcion3.class));
        finish();
    }
    public void entrante4(View view) {
        startActivity(new Intent(getApplicationContext(), EDescripcion4.class));
        finish();
    }
    public void entrante5(View view) {
        startActivity(new Intent(getApplicationContext(), EDescripcion5.class));
        finish();
    }
    public void entrante6(View view) {
        startActivity(new Intent(getApplicationContext(), EDescripcion6.class));
        finish();
    }
    public void entrante7(View view) {
        startActivity(new Intent(getApplicationContext(), EDescripcion7.class));
        finish();
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(), MenuC.class));
        finish();
    }
}
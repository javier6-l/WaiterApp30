package com.example.waiterapp30.Sopas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waiterapp30.MenuC;
import com.example.waiterapp30.R;
import com.example.waiterapp30.Sopas.SopasDescripcion.SDescripcion1;
import com.example.waiterapp30.Sopas.SopasDescripcion.SDescripcion2;
import com.example.waiterapp30.Sopas.SopasDescripcion.SDescripcion3;
import com.example.waiterapp30.Sopas.SopasDescripcion.SDescripcion4;
import com.example.waiterapp30.Sopas.SopasDescripcion.SDescripcion5;
import com.example.waiterapp30.Sopas.SopasDescripcion.SDescripcion6;
import com.example.waiterapp30.Sopas.SopasDescripcion.SDescripcion7;

public class Sopas1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopas1);
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(), MenuC.class));
        finish();
    }

    public void sopa(View view) {
        startActivity(new Intent(getApplicationContext(), SDescripcion1.class));
        finish();
    }

    public void sopa2(View view) {
        startActivity(new Intent(getApplicationContext(), SDescripcion2.class));
        finish();
    }

    public void sopa3(View view) {
        startActivity(new Intent(getApplicationContext(), SDescripcion3.class));
        finish();
    }
    public void sopa4(View view) {
        startActivity(new Intent(getApplicationContext(), SDescripcion4.class));
        finish();
    }
    public void sopa5(View view) {
        startActivity(new Intent(getApplicationContext(), SDescripcion5.class));
        finish();
    }
    public void sopa6(View view) {
        startActivity(new Intent(getApplicationContext(), SDescripcion6.class));
        finish();
    }
    public void sopa7(View view) {
        startActivity(new Intent(getApplicationContext(), SDescripcion7.class));
        finish();
    }
}

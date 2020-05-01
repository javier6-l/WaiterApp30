package com.example.waiterapp30.Principales;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waiterapp30.MenuC;
import com.example.waiterapp30.Principales.PriDescripcion.PriDescripcion1;
import com.example.waiterapp30.Principales.PriDescripcion.PriDescripcion2;
import com.example.waiterapp30.Principales.PriDescripcion.PriDescripcion3;
import com.example.waiterapp30.Principales.PriDescripcion.PriDescripcion4;
import com.example.waiterapp30.Principales.PriDescripcion.PriDescripcion5;
import com.example.waiterapp30.Principales.PriDescripcion.PriDescripcion6;
import com.example.waiterapp30.Principales.PriDescripcion.PriDescripcion7;
import com.example.waiterapp30.R;

public class Principal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal1);
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(), MenuC.class));
        finish();
    }

    public void principal(View view) {
        startActivity(new Intent(getApplicationContext(), PriDescripcion1.class));
        finish();
    }

    public void principal2(View view) {
        startActivity(new Intent(getApplicationContext(), PriDescripcion2.class));
        finish();
    }

    public void principal3(View view) {
        startActivity(new Intent(getApplicationContext(), PriDescripcion3.class));
        finish();
    }

    public void principal4(View view) {
        startActivity(new Intent(getApplicationContext(), PriDescripcion4.class));
        finish();
    }

    public void principal5(View view) {
        startActivity(new Intent(getApplicationContext(), PriDescripcion5.class));
        finish();
    }

    public void principal6(View view) {
        startActivity(new Intent(getApplicationContext(), PriDescripcion6.class));
        finish();
    }

    public void principal7(View view) {
        startActivity(new Intent(getApplicationContext(), PriDescripcion7.class));
        finish();
    }
}

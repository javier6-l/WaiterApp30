package com.example.waiterapp30.Postres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.waiterapp30.MenuC;
import com.example.waiterapp30.Pedir;
import com.example.waiterapp30.Postres.PDescripcion.Descripcion1;
import com.example.waiterapp30.Postres.PDescripcion.Descripcion2;
import com.example.waiterapp30.Postres.PDescripcion.Descripcion3;
import com.example.waiterapp30.Postres.PDescripcion.Descripcion4;
import com.example.waiterapp30.Postres.PDescripcion.Descripcion5;
import com.example.waiterapp30.Postres.PDescripcion.Descripcion6;
import com.example.waiterapp30.Postres.PDescripcion.Descripcion7;
import com.example.waiterapp30.R;

public class Postres1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres1);
    }

    public void postre(View view) {
        startActivity(new Intent(getApplicationContext(), Descripcion1.class));
        finish();
    }

    public void postre2(View view) {
        startActivity(new Intent(getApplicationContext(), Descripcion2.class));
        finish();
    }

    public void postre3(View view) {
        startActivity(new Intent(getApplicationContext(), Descripcion3.class));
        finish();
    }

    public void postre4(View view) {
        startActivity(new Intent(getApplicationContext(), Descripcion4.class));
        finish();
    }

    public void postre5(View view) {
        startActivity(new Intent(getApplicationContext(), Descripcion5.class));
        finish();
    }
    public void postre6(View view) {
        startActivity(new Intent(getApplicationContext(), Descripcion6.class));
        finish();
    }
    public void postre7(View view) {
        startActivity(new Intent(getApplicationContext(), Descripcion7.class));
        finish();
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(), MenuC.class));
        finish();
    }
}

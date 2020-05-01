package com.example.waiterapp30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waiterapp30.Bebidas.Bebidas1;
import com.example.waiterapp30.Entrantes.Entrantes1;
import com.example.waiterapp30.Postres.Postres1;
import com.example.waiterapp30.Principales.Principal1;
import com.example.waiterapp30.Sopas.Sopas1;

public class MenuC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_c);
    }

    public void postre(View view) {
        startActivity(new Intent(getApplicationContext(), Postres1.class));
        finish();
    }

    public void sopas(View view) {
        startActivity(new Intent(getApplicationContext(), Sopas1.class));
        finish();
    }

    public void princial(View view) {
        startActivity(new Intent(getApplicationContext(), Principal1.class));
        finish();
    }
    public void entrante(View view) {
        startActivity(new Intent(getApplicationContext(), Entrantes1.class));
        finish();
    }

    public void Bebidas(View view) {
        startActivity(new Intent(getApplicationContext(), Bebidas1.class));
        finish();
    }
}

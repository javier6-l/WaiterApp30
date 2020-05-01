package com.example.waiterapp30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pedir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir);
    }

    public void Comida(View view) {
        startActivity(new Intent(getApplicationContext(),Restaurantes.class));
        finish();
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();
    }
}

package com.example.waiterapp30;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Restaurantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(),Pedir.class));
        finish();
    }

    public void Menu(View view) {
        startActivity(new Intent(getApplicationContext(),Fotos.class));
        finish();
    }
}

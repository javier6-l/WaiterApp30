package com.example.waiterapp30.Menu;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waiterapp30.R;

public class HPedidos extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h_pedidos);

        gridView = findViewById(R.id.grid_view);

    }
}

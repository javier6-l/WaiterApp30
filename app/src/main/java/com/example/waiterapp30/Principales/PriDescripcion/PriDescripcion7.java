package com.example.waiterapp30.Principales.PriDescripcion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waiterapp30.Principales.Principal1;
import com.example.waiterapp30.R;

public class PriDescripcion7 extends AppCompatActivity {
    LinearLayout linearLayout;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pri_descripcion7);
        linearLayout = findViewById(R.id.linearlayout1);
        aSwitch = findViewById(R.id.switch1);

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aSwitch.isChecked()) {
                    linearLayout.setBackgroundColor(Color.GREEN);
                } else
                    linearLayout.setBackgroundColor(Color.WHITE);
            }
        });
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(), Principal1.class));
        finish();
    }
}
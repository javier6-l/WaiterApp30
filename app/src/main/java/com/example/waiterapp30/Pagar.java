package com.example.waiterapp30;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pagar extends AppCompatActivity {
    CheckBox checkBox1, checkBox2, checkBox3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);
        checkBox1 = findViewById(R.id.checkb1);
        checkBox2 = findViewById(R.id.checkb2);
        checkBox3 = findViewById(R.id.checkb3);
        button = findViewById(R.id.button_submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked()){
                    Toast.makeText(getApplicationContext(),""+checkBox1.getText() +" , "+
                            checkBox2.getText() +" , "+checkBox3.getText(), Toast.LENGTH_SHORT).show();

                }else if (checkBox1.isChecked()&& checkBox2.isChecked()){
                    Toast.makeText(getApplicationContext(),""+checkBox1.getText()+" , "+
                            checkBox2.getText(),Toast.LENGTH_SHORT).show();

                }else if (checkBox1.isChecked()&& checkBox3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "" + checkBox1.getText() + ", " +
                            checkBox3.getText(), Toast.LENGTH_SHORT).show();

                }else if (checkBox2.isChecked()&& checkBox3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "" + checkBox2.getText() + " , " +
                            checkBox3.getText(), Toast.LENGTH_SHORT).show();

                }else if(checkBox1.isChecked()){
                    Toast.makeText(getApplicationContext(),""+checkBox1.getText(),Toast.LENGTH_SHORT).show();

                }else if(checkBox2.isChecked()) {
                    Toast.makeText(getApplicationContext(), "" + checkBox2.getText(), Toast.LENGTH_SHORT).show();

                }else if(checkBox3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "" + checkBox3.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void cancelar(View view) {
        startActivity(new Intent(getApplicationContext(), MenuC.class));
        finish();
    }

    public void atras(View view) {
        startActivity(new Intent(getApplicationContext(), Hpedidos.class));
        finish();
    }
}
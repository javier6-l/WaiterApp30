package com.example.waiterapp30;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.waiterapp30.Bebidas.Bebidas1;
import com.example.waiterapp30.Cervezas.Cerveza1;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Item one selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item two selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item three selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "Item four selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this, "Sub Item one  selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "Sub Item two selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem3:
                Toast.makeText(this, "Sub Item one  selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

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

    public void Cervezas(View view) {
        startActivity(new Intent(getApplicationContext(), Cerveza1.class));
        finish();
    }
}

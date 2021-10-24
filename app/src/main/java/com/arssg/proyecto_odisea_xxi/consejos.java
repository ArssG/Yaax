package com.arssg.proyecto_odisea_xxi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.net.URI;

public class consejos extends AppCompatActivity {
     private Button button4, button5, button6, button7, button8;
     String url1 = "https://www.youtube.com/watch?v=nvUqnpicSd0&t=22s";
     String url2 = "https://www.youtube.com/watch?v=auj4bXMHL-8";
     String url3 = "https://www.youtube.com/watch?v=cmxgUNBzmzs";
     String url4 = "https://www.youtube.com/watch?v=ZENyo3eqKTU";
     String url5 = "https://www.youtube.com/watch?v=eBYUbw_X1po";
     BottomNavigationView bottomnavigationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url1);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url2);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url3);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url4);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link = Uri.parse(url5);
                Intent i = new Intent(Intent.ACTION_VIEW, link);
                startActivity(i);
            }
        });

        bottomnavigationview = findViewById(R.id.bottom_navigation);
        bottomnavigationview.setSelectedItemId(R.id.consejos);
        bottomnavigationview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_screen:
                        Intent i = new Intent(consejos.this, pantalla_menu.class);
                        startActivity(i);
                        return true;



                    case R.id.map:
                        Intent i3 = new Intent(consejos.this, MapaActivity.class);
                        startActivity(i3);
                        return true;

                    case R.id.perfil:
                        Intent i4 = new Intent(consejos.this, perfil.class);
                        startActivity(i4);
                        return true;
                }
                return false;

            }
        });
    }
}
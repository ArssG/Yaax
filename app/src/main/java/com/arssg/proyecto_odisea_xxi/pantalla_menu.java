package com.arssg.proyecto_odisea_xxi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class pantalla_menu extends AppCompatActivity {

    private Button btn, btn2, btn3;
    BottomNavigationView bottomnavigationview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_menu);

        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pantalla_menu.this, perfil.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pantalla_menu.this, MapaActivity.class);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(pantalla_menu.this, consejos.class);
                startActivity(i);
            }
        });

        bottomnavigationview = findViewById(R.id.bottom_navigation);
        bottomnavigationview.setSelectedItemId(R.id.home_screen);
       bottomnavigationview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull  MenuItem item) {
               switch (item.getItemId()){

                   case R.id.consejos:
                       Intent i2 = new Intent(pantalla_menu.this, consejos.class);
                       startActivity(i2);
                       return true;

                   case R.id.map:
                       Intent i3 = new Intent(pantalla_menu.this, MapaActivity.class);
                       startActivity(i3);
                       return true;

                   case R.id.perfil:
                       Intent i4 = new Intent(pantalla_menu.this, perfil.class);
                       startActivity(i4);
                       return true;
               }
               return false;

           }
       });
    }
}
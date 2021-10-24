package com.arssg.proyecto_odisea_xxi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class perfil extends AppCompatActivity {
    BottomNavigationView bottomnavigationview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        bottomnavigationview = findViewById(R.id.bottom_navigation);
        bottomnavigationview.setSelectedItemId(R.id.perfil);
        bottomnavigationview.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home_screen:
                        Intent i = new Intent(perfil.this, pantalla_menu.class);
                        startActivity(i);
                        return true;

                    case R.id.consejos:
                        Intent i2 = new Intent(perfil.this, consejos.class);
                        startActivity(i2);
                        return true;

                    case R.id.map:
                        Intent i3 = new Intent(perfil.this, MapaActivity.class);
                        startActivity(i3);
                        return true;


                }
                return false;

            }
        });
    }

}
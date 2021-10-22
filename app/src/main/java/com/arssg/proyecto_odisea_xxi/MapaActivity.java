package com.arssg.proyecto_odisea_xxi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaActivity extends FragmentActivity implements OnMapReadyCallback  {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        map = googleMap;
        LatLng u1 = new LatLng(19.408129, -99.042976);   //DINNZA
        LatLng u2 = new LatLng(19.654449, -99.207414); //Bodega Aurrera
        LatLng u3 = new LatLng(19.649870, -99.034311);   //ALMACÉN RECICLA & RECIBE (REAL VERONA)
        LatLng u4 = new LatLng(19.630723, -99.002146);   //Recicladora Tai Yang
        LatLng u5 = new LatLng(19.707552, -98.831692);   //Desperdicios Industriales "Márquez De La Rosa"
        LatLng u7 = new LatLng(19.560536, -98.897285);   //CASA VERDE I ECOTIENDA
        LatLng u8 = new LatLng(19.535518, -98.909880);   //AMBIENTATEX
        LatLng u9 = new LatLng(19.430119, -98.941208);   //MASHAH
        LatLng u10 = new LatLng(19.395157, -98.981132);  //Reciclables Neza
        LatLng u11 = new LatLng(19.399180, -99.287971);  //SAM'S CLUB JESUS DEL MONTE



        map.addMarker(new MarkerOptions().position(u1).title("DINNZA"));
        map.addMarker(new MarkerOptions().position(u2).title("Bodega Aurrera"));
        map.addMarker(new MarkerOptions().position(u3).title("ALMACÉN RECICLA & RECIBE (REAL VERONA)"));
        map.addMarker(new MarkerOptions().position(u4).title("Recicladora Tai Yang"));
        map.addMarker(new MarkerOptions().position(u5).title("Desperdicios Industriales \"Márquez De La Rosa\""));
        map.addMarker(new MarkerOptions().position(u7).title("CASA VERDE I ECOTIENDA"));
        map.addMarker(new MarkerOptions().position(u8).title("AMBIENTATEX"));
        map.addMarker(new MarkerOptions().position(u9).title("MASHAH"));
        map.addMarker(new MarkerOptions().position(u10).title("Reciclables Neza"));
        map.addMarker(new MarkerOptions().position(u11).title("SAM'S CLUB JESUS DEL MONTE"));

        map.moveCamera(CameraUpdateFactory.newLatLng(u1));



    }
}
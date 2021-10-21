package com.arssg.proyecto_odisea_xxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;
    Button btnLogin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Cambiar el color del icono de Barra de estado
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.editTextEmail);
        password = (EditText) findViewById(R.id.editTextPassword);
        btnLogin = (Button) findViewById(R.id.cirLoginButton);
        DB = new DBHelper(this);
    }

    public void onLoginClick(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }

    public void btnSingin(View view) {
        String correo = email.getText().toString();
        String contraseña = password.getText().toString();

        if (correo.equals("")|| contraseña.equals("") )
            Toast.makeText(LoginActivity.this, "Favor de no dejar campos vacios", Toast.LENGTH_SHORT).show();
        else{
            Boolean checkemailpass = DB.checkemailpassword(correo, contraseña);
            if(checkemailpass == true){
                Toast.makeText(LoginActivity.this, "¡Ingreso exitoso!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), pantalla_menu.class);
                startActivity(intent);
            }else {
                Toast.makeText(LoginActivity.this, "¡Datos incorrectos!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
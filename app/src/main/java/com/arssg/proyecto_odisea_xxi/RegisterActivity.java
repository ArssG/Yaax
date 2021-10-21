package com.arssg.proyecto_odisea_xxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText username, email, mobile, password;
    Button signup;
    TextView signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        changeStatusColorBar();

        username = (EditText) findViewById(R.id.editTextName);
        email = (EditText) findViewById(R.id.editTextEmail);
        mobile = (EditText) findViewById(R.id.editTextMobile);
        password = (EditText) findViewById(R.id.editTextPassword);
        signup = (Button) findViewById(R.id.cirRegisterButton);
        signin = (TextView) findViewById(R.id.signInRegister);
        DB = new DBHelper(this);

    }

    public void changeStatusColorBar() {
        //Cambiar el color del icono de Barra de estado
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.register_bk_color));

        }
    }

    public void onRegisterClick(View view) {
        startActivity(new Intent(this, LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_left);
    }

    public void btnSingUp(View view) {
        String usuario = username.getText().toString();
        String correo = email.getText().toString();
        String telefono = mobile.getText().toString();
        String contraseña = password.getText().toString();

        if (usuario.equals("")|| correo.equals("")||telefono.equals("")||contraseña.equals("") )
            Toast.makeText(RegisterActivity.this, "Favor de no dejar campos vacios", Toast.LENGTH_SHORT).show();
        else {
            Boolean checkuser = DB.checkusernamepasswordemailphone(usuario, contraseña, telefono, correo);
            if (checkuser == false){
                Boolean insert = DB.insertData(usuario, contraseña, telefono, correo);
                if (insert == true){
                    Toast.makeText(RegisterActivity.this, "¡Registro exitoso!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                    Toast.makeText(RegisterActivity.this, "¡Inicie de nuevo sesión!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(RegisterActivity.this, "Registro fallido", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(RegisterActivity.this, "Usuario ya existente, ingrese otro por favor", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
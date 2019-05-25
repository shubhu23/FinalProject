package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {
    EditText e;
    EditText p;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        e=findViewById(R.id.etLoginUsername);
        p=findViewById(R.id.etLoginPassword);
        login=findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e.getText().toString().equals("")){

                    e.setError("Email should not be empty");

                }else if(p.getText().toString().equals("")) {

                    p.setError("Password should not be empty");

                }

                if(e.getText().toString().equals("shub@gmail.com") && p.getText().toString().equals("23101997")){
                    overridePendingTransition(R.anim.fadein, R.anim.fade_out);
                    Toast.makeText(AdminLogin.this, "Login successful....", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText( AdminLogin.this, "Username and Password doesn't match", Toast.LENGTH_SHORT ).show();
                }
                Intent intent=new Intent(AdminLogin.this,FilterActivity.class);
                startActivity(intent);
            }
        });
    }

}
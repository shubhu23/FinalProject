package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    Button btnReg,btnLoginReg;
    EditText edtFullname, edtUserName, edtPass, edtConfPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        edtFullname= findViewById(R.id.etFullName);
        edtUserName = findViewById(R.id.etLoginUsername);
        edtPass = findViewById(R.id.etPassword);
        edtConfPass = findViewById(R.id.etConfirmPassword);
        //Initialization of Register Button
        btnReg = findViewById(R.id.btnRegister);
        btnLoginReg=findViewById(R.id.btnRegisterLogin);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginPage.class);
                startActivity(intent);
            }
        });
        btnLoginReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupActivity.this, LoginPage.class);
                startActivity(intent);
            }
        });
    }
}
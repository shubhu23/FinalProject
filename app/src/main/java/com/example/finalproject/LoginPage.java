package com.example.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
    EditText e;
    EditText p;
    Button login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        e=findViewById(R.id.etLoginUsername);
        p=findViewById(R.id.etLoginPassword);
        login=findViewById(R.id.btnLogin);
        signup=findViewById(R.id.btnLoginRegister);
        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        final String password = "^(?=.*[A-Za-z])(?=.*\\\\d)(?=.*[$@$!%*#?&])[A-Za-z\\\\d$@$!%*#?&]{8,}$";
        final CharSequence inputStr = password;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e.getText().toString().equals("")){

                    e.setError("Email should not be empty");

                }else if(p.getText().toString().equals("")) {

                    p.setError("Password should not be empty");

                }

                if(e.getText().toString().equals(emailPattern) && p.getText().toString().equals(inputStr)){
                    overridePendingTransition(R.anim.fadein, R.anim.fade_out);
                    Toast.makeText(LoginPage.this, "Login successful....", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText( LoginPage.this, "Username and Password doesn't match", Toast.LENGTH_SHORT ).show();
                }

            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(LoginPage.this,FilterActivity.class);
                startActivity(intent1);
            }
        });
    }

}

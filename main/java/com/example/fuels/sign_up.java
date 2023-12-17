package com.example.fuels;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class sign_up extends AppCompatActivity {
    Button alr_login;
    Button regi;
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);









        alr_login=findViewById(R.id.ttView);
        regi=findViewById(R.id.buttonr);


        alr_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sign_up.this, "loging in account", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(sign_up.this,sign_in.class );
                startActivity(intent);
            }
        });

        regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(sign_up.this, "signing in account", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(sign_up.this, fuel_amount.class );
                startActivity(intent);
            }
        });

    }
}
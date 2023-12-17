package com.example.fuels;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sign_in extends AppCompatActivity {
     EditText email1;
     EditText password1;
    Button Newacc;
    Button newlog;
    //    private FirebaseAuth auth;
    @SuppressLint("WrongViewCast")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        MyDatabaseHelper dbhelper = new MyDatabaseHelper(this);




//import com.google.firebase.FirebaseApp;
//import com.google.firebase.auth.FirebaseAuth;




                email1=findViewById(R.id.editTextTextEmailAddress);
                password1=findViewById(R.id.editTextTextPassword);
                Newacc=findViewById(R.id.textView);
                newlog=findViewById(R.id.button);

        String email=email1.getText().toString();
        String password=password1.getText().toString();
//        auth=FirebaseAuth.getInstance();

                Newacc.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(sign_in.this, "new account", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(sign_in.this,sign_up.class );
                        startActivity(intent);

                    }
                });




                newlog.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View v) {
                        if (email1 != null && password1 != null) {
                            String email = email1.getText().toString();
                            String password = password1.getText().toString();
                            // Your further logic here


                            boolean isInsert = dbhelper.insertData1(email,password);
                            if (isInsert = true) { // Corrected the comparison operator
                                Toast.makeText(sign_in.this, "Logged In", Toast.LENGTH_SHORT).show();
//                                Toast.makeText(sign_in.this, "login", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(sign_in.this, fuel_amount.class );
                                startActivity(intent);
                        }
                        else {
                            Toast.makeText(sign_in.this, "Error", Toast.LENGTH_SHORT).show();
                        }}


                    }
                });





            }

        }
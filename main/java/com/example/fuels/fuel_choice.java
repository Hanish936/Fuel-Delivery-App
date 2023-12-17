package com.example.fuels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class fuel_choice extends AppCompatActivity {
    ImageButton petrol;
    ImageButton diesel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel_choice);
                getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
                );


                petrol=findViewById(R.id.petrol);
                diesel=findViewById(R.id.diesel);

                petrol.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(fuel_choice.this, "You chose petrol", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(fuel_choice.this,fuel_amount.class );
                        startActivity(intent);
                    }
                });

                diesel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Perform the navigation to the new activity here
                        Intent intent = new Intent(fuel_choice.this, fuel_amount.class);
                        startActivity(intent);
                    }
                });
            }
        }




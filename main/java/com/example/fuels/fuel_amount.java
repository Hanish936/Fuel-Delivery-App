package com.example.fuels;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fuel_amount extends AppCompatActivity {


    TextView tv1, tvs;
    EditText typef;
    Button place_order;
    MyDatabaseHelper dbhelper;
//    AddData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel_amount);
        MyDatabaseHelper dbhelper = new MyDatabaseHelper(this);


        tv1 = findViewById(R.id.tv1);
        typef = findViewById(R.id.typef);

        place_order = findViewById(R.id.place_order);

        place_order.setOnClickListener(new View.OnClickListener() {

        @Override

        public void onClick(View view) {
           if(tv1 != null && typef != null){
        boolean isInserted = dbhelper.insertData(tv1.getText().toString(),
                        typef.getText().toString());
        if (isInserted = true) { // Corrected the comparison operator
                Toast.makeText(fuel_amount.this, "Fuel Added", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(fuel_amount.this, "Fuel not Added", Toast.LENGTH_SHORT).show();
                }
            Intent i= new Intent(fuel_amount.this, exit.class);
            startActivity(i);
                }}
            });
        }


}
//                place_order.setOnClickListener(new View.OnClickListener() {


//        place_order.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String inputData = typef.getText().toString().trim();
//                String inputdata = tvs.getText().toString().trim(); // Get text from EditText
//                if (!inputData.isEmpty()) {
//                    // Insert data into SQLite database
//                    MyDatabaseHelper dbHelper = new MyDatabaseHelper(getApplicationContext());
//                    SQLiteDatabase db = dbHelper.getWritableDatabase();
//
//                    ContentValues values = new ContentValues();
//                    values.put("column_name", inputData); // Replace "column_name" with your column name
//
//                    long newRowId = db.insert("table_name", null, values); // Replace "table_name" with your table name
//
//                    if (newRowId != -1) {
//                        Toast.makeText(getApplicationContext(), "Data inserted successfully", Toast.LENGTH_SHORT).show();
//                    } else {
//                        Toast.makeText(getApplicationContext(), "Failed to insert data", Toast.LENGTH_SHORT).show();
//                    }
//                    db.close();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Please enter data", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });


//        place_order.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dbhelper.addData();
//            }
//        });


//    public void sendData(){
//        String s= radioButton.getText().toString();
//
//        int tv=Integer.parseInt(tv1.getText().toString().trim());
//
//        Intent i= new Intent(amount_of_fuel.this, receipt.class);
//        i.putExtra(receipt.s,s);
//        i.putExtra(receipt.tv,tv);
//
//        startActivity(i);



//        place_order.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                FirebaseDatabase.getInstance().getReference().child("petrol").setValue("petrol");
//                Toast.makeText(amount_of_fuel.this, "go", Toast.LENGTH_SHORT).show();
//                Intent intent=new Intent(amount_of_fuel.this,receipt.class );
//                startActivity(intent);
//            }
//        });









//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.Button;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.Toast;
//
//public class amount_of_fuel extends Activity {
//
//    private RadioGroup radioGroup;
//    private RadioButton radioButton;
//    private Button btnDisplay;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_amount_of_fuel);
//
//        addListenerOnButton();
//
//    }
//
//    public void addListenerOnButton() {
//
//        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
//        btnDisplay = (Button) findViewById(R.id.place_order);
//
//        btnDisplay.setOnClickListener(new OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//                // get selected radio button from radioGroup
//                int selectedId = radioGroup.getCheckedRadioButtonId();
//
//                // find the radiobutton by returned id
//                radioButton = (RadioButton) findViewById(selectedId);
//
//                Toast.makeText(amount_of_fuel.this,
//                        radioButton.getText(), Toast.LENGTH_SHORT).show();
//
//            }
//
//        });

//} }

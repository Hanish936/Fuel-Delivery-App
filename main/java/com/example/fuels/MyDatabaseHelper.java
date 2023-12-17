package com.example.fuels;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyDatabaseHelper extends SQLiteOpenHelper  {

    TextView tv1, tvs;
    EditText typef;
    Button place_order;
    private final Context context;
    private static final String DATABASE_NAME="Fuel_amont";
    private static final int DATABASE_VERISON=1;

    private static final String TABLE_NAME="fuel";
    private static final String TABLE_LOGIN="login_table";
    private static final String COLUMN_ID="_id";
    private static final String COLUMN_TYPE="FUEL_Type";
    private static final String COLUMN_AMOUNT="Amount_of_fuel";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_PASSWORD = "password";

    private static final String CREATE_TABLE_LOGIN = "CREATE TABLE " + TABLE_LOGIN +
            "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COLUMN_USERNAME + " TEXT, " +
            COLUMN_PASSWORD + " TEXT)";


    public MyDatabaseHelper(@NonNull Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERISON);
        this.context=context;


    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query="CREATE TABLE "+ TABLE_NAME+
                "("+ COLUMN_ID + "  INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TYPE + "TEXT, " +
                COLUMN_AMOUNT + "INTEGER);";
        db.execSQL(query);
        db.execSQL(CREATE_TABLE_LOGIN);
//        SQLiteDatabase database= this.getWritableDatabase();
//        database.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_LOGIN);
        onCreate(db);

    }
    public boolean insertData(String fuel_type, String amt){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_TYPE,fuel_type);
//        long result=db.insert(TABLE_NAME,null, values);

        values.put(COLUMN_AMOUNT,amt);
        long result= db.insert(TABLE_NAME, null,values);

        if(result==-1)
            return false;
        else
            return true;

    }
    public boolean insertData1(String username, String password){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_USERNAME,username);
//        long result=db.insert(TABLE_NAME,null, values);

        values.put(COLUMN_PASSWORD,password);
        long result= db.insert(TABLE_LOGIN, null,values);

        if(result==-1)
            return false;
        else
            return true;

    }
}

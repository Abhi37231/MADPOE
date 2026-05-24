package com.example.sqlitedisplaydata;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1,b2;
    TextView t1;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        t1=findViewById(R.id.t1);

        db=openOrCreateDatabase(
                "StudentDB",
                MODE_PRIVATE,
                null);

        db.execSQL(
                "CREATE TABLE IF NOT EXISTS student(name TEXT)");

        b1.setOnClickListener(v -> {

            String n=e1.getText().toString();

            db.execSQL(
                    "INSERT INTO student VALUES('"+n+"')");

            Toast.makeText(
                    this,
                    "Inserted",
                    Toast.LENGTH_SHORT).show();
        });

        b2.setOnClickListener(v -> {

            Cursor c=db.rawQuery(
                    "SELECT * FROM student",
                    null);

            String s="";

            while(c.moveToNext()){

                s=s+c.getString(0)+"\n";
            }

            t1.setText(s);
        });
    }
}
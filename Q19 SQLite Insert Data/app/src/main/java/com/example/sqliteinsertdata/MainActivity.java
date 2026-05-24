package com.example.sqliteinsertdata;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.e1);
        b1 = findViewById(R.id.b1);

        db = openOrCreateDatabase(
                "StudentDB",
                MODE_PRIVATE,
                null);

        db.execSQL(
                "CREATE TABLE IF NOT EXISTS student(name TEXT)");

        b1.setOnClickListener(v -> {

            String n = e1.getText().toString();

            db.execSQL(
                    "INSERT INTO student VALUES('"+n+"')");

            Toast.makeText(
                    this,
                    "Inserted",
                    Toast.LENGTH_SHORT).show();
        });
    }
}
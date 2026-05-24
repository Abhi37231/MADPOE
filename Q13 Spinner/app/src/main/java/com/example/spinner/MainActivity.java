package com.example.spinner;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Spinner s1;

    String[] item={
            "Java",
            "Python",
            "Flutter"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    s1 = findViewById(R.id.s1);

    ArrayAdapter<String> a = new ArrayAdapter<>(
            this,
            android.R.layout.simple_spinner_item,
            item);
    s1.setAdapter(a);
    }
}
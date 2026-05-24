package com.example.alertdialog;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(v -> {
           AlertDialog.Builder a = new AlertDialog.Builder(MainActivity.this);
           a.setTitle("Alert Dialog");
           a.setMessage("Hello User");
           a.setPositiveButton("OK",null);
           a.show();
        });

    }
}
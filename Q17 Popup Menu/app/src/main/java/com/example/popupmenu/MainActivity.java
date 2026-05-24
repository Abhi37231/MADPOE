package com.example.popupmenu;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);

        b1.setOnClickListener(v -> {

            PopupMenu p =
                    new PopupMenu(
                            MainActivity.this,
                            b1);

            p.getMenu().add("Home");
            p.getMenu().add("About");

            p.setOnMenuItemClickListener(item -> {

                Toast.makeText(
                        MainActivity.this,
                        item.getTitle(),
                        Toast.LENGTH_SHORT).show();

                return true;
            });

            p.show();

        });
    }
}
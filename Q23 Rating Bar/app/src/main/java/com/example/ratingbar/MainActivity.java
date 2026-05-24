package com.example.ratingbar;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar r1;
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1=findViewById(R.id.r1);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(v -> {

            float rate=r1.getRating();

            t1.setText(
                    "Rating : "+rate);

        });
    }
}
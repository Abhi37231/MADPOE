package com.example.togglebutton;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ToggleButton tg1;
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tg1=findViewById(R.id.tg1);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(v -> {

            if(tg1.isChecked()){

                t1.setText("ON");
            }

            else{

                t1.setText("OFF");
            }
        });
    }
}
package com.example.progressbar;

import android.os.Bundle;
import android.os.Handler;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ProgressBar p1;
    Button b1;
    TextView t1;

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1=findViewById(R.id.p1);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);

        Handler h=new Handler();

        b1.setOnClickListener(v -> {

            i=0;

            h.postDelayed(new Runnable() {

                @Override
                public void run() {

                    if(i<=100){

                        p1.setProgress(i);

                        t1.setText(i+"%");

                        i=i+10;

                        h.postDelayed(this,500);
                    }
                }
            },500);
        });
    }
}
package com.example.storedataintofile;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.e1);
        b1=findViewById(R.id.b1);

        b1.setOnClickListener(v -> {

            try {

                String s=e1.getText().toString();

                FileOutputStream f=
                        openFileOutput(
                                "myfile.txt",
                                MODE_PRIVATE);

                f.write(s.getBytes());
                f.close();

                Toast.makeText(
                        this,
                        "File Saved",
                        Toast.LENGTH_SHORT).show();

            } catch (Exception e) {

                e.printStackTrace();
            }
        });
    }
}
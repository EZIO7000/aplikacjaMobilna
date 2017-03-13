package com.rybalko.jakub.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    Button p1;
    Button p2;
    Button p3;
    Button p4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1 = (Button) findViewById(R.id.button1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Przycisk_1.class);
                startActivity(i);
            }
        });

        p2 = (Button) findViewById(R.id.button2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Przycisk_2.class);
                startActivity(i);
            }
        });

        p3 = (Button) findViewById(R.id.button3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Przycisk_3.class);
                startActivity(i);
            }
        });

        p4 = (Button) findViewById(R.id.button4);
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Przycisk_4.class);
                startActivity(i);
            }
        });
    }
}

package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pindah2,pindah3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pindah2 = (Button) findViewById(R.id.pindah2);
        pindah3 = (Button) findViewById(R.id.pindah3);

        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });
        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pindah3();
            }
        });
    }

    public void pindah3(){
        Intent intent2 = new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(intent2);
    }
}
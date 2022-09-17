package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_year extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_year);

        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button28();
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                button16();
            }
        });
    }

    public void button28() {
        Intent intent = new Intent(second_year.this, light.class);
        startActivity(intent);
    }
    public void button16(){
        Intent intent =new Intent(second_year.this, fans.class);
        startActivity(intent);
    }
    }

package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forthyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forthyear);
        Button button202 = (Button) findViewById(R.id.button202);
        Button button203= (Button) findViewById(R.id.button203);
        button202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button210();
            }
        });
        button203.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                button250();
            }
        });
    }



    public void button210() {
        Intent intent = new Intent(forthyear.this, lights04.class);
        startActivity(intent);
    }

    public void button250(){
        Intent intent =new Intent(forthyear.this, fans04.class);
        startActivity(intent);
    }
}





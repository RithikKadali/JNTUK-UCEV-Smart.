package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdyear);
        Button button103 = (Button) findViewById(R.id.button103);
        Button button104 = (Button) findViewById(R.id.button104);
        button103.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                button111();
            }
        });
        button104.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                button150();
            }
        });
    }






    public void button111(){
        Intent intent =new Intent(thirdyear.this, lights03.class);
        startActivity(intent);
    }









public void button150(){
        Intent intent =new Intent(thirdyear.this, fans03.class);
        startActivity(intent);
        }
        }

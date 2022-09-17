package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class classroom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom);

        Button button3 = (Button) findViewById(R.id.button3);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button103();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button202();
            }
        });
    }




    public void button11() {
        Intent intent = new Intent(classroom.this, second_year.class);
        startActivity(intent);
    }

    public void button103() {
        Intent intent = new Intent(classroom.this, thirdyear.class);
        startActivity(intent);
    }

    public void button202(){
        Intent intent =new Intent(classroom.this, forthyear.class);
        startActivity(intent);
    }
}










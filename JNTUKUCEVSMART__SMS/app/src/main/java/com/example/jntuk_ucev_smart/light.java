package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class light extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

        Button button28=(Button)findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLLON",null,null);

            }
        });

        Button button31=(Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLLOFF",null,null);
            }
        });


        Button button33=(Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLLLON",null,null);
            }
        });

        Button button35=(Button)findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLLLOFF",null,null);
            }
        });

        Button button37=(Button)findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLLLLON",null,null);
            }
        });

        Button button39=(Button)findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLLLLOFF",null,null);
            }
        });


        Button button41=(Button)findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLBON",null,null);
            }
        });


        Button button42=(Button)findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLBOFF",null,null);
            }
        });

        Button button30=(Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLRON",null,null);
            }
        });

        Button button32=(Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLROFF",null,null);
            }
        });

        Button button34=(Button)findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLRRON",null,null);
            }
        });

        Button button36=(Button)findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLRROFF",null,null);
            }
        });

        Button button38=(Button)findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLRRRON",null,null);
            }
        });

        Button button40=(Button)findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUSLRRROFF",null,null);
            }
        });

    }
}

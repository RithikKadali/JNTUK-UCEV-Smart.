package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class fans04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fans04);

        Button button250=(Button)findViewById(R.id.button250);
        button250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFLON",null,null);
            }
        });

        Button button256=(Button)findViewById(R.id.button256);
        button256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFLOFF",null,null);
            }
        });

        Button button252=(Button)findViewById(R.id.button252);
        button252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFBLON",null,null);
            }
        });

        Button button259=(Button)findViewById(R.id.button259);
        button259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFBLOFF",null,null);
            }
        });

        Button button253=(Button)findViewById(R.id.button253);
        button253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFMON",null,null);
            }
        });

        Button button258=(Button)findViewById(R.id.button258);
        button258.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFMOFF",null,null);
            }
        });

        Button button251=(Button)findViewById(R.id.button251);
        button251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFRON",null,null);
            }
        });

        Button button257=(Button)findViewById(R.id.button257);
        button257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFROFF",null,null);
            }
        });

        Button button254=(Button)findViewById(R.id.button254);
        button254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFBRON",null,null);
            }
        });

        Button button260=(Button)findViewById(R.id.button260);
        button260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFFBROFF",null,null);
            }
        });
    }
}

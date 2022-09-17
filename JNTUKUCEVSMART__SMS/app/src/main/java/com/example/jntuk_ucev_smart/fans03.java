package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class fans03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fans03);

        Button button150=(Button)findViewById(R.id.button150);
        button150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFLON",null,null);
            }
        });

        Button button156=(Button)findViewById(R.id.button156);
        button156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFLOFF",null,null);
            }
        });

        Button button152=(Button)findViewById(R.id.button152);
        button152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFBLON",null,null);
            }
        });

        Button button159=(Button)findViewById(R.id.button159);
        button159.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFBLOFF",null,null);
            }
        });

        Button button153=(Button)findViewById(R.id.button153);
        button153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFMON",null,null);
            }
        });

        Button button158=(Button)findViewById(R.id.button158);
        button158.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFMOFF",null,null);
            }
        });

        Button button151=(Button)findViewById(R.id.button151);
        button151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFRON",null,null);
            }
        });

        Button button157=(Button)findViewById(R.id.button157);
        button157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFROFF",null,null);
            }
        });

        Button button154=(Button)findViewById(R.id.button154);
        button154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFBRON",null,null);
            }
        });

        Button button160=(Button)findViewById(R.id.button160);
        button160.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTFBROFF",null,null);
            }
        });
    }
}

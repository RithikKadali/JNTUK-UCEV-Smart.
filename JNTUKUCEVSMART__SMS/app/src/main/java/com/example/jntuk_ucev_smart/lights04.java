package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class lights04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights04);

        Button button210=(Button)findViewById(R.id.button210);
        button210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLLON",null,null);
            }
        });

        Button button213=(Button)findViewById(R.id.button213);
        button213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLLOFF",null,null);
            }
        });

        Button button215=(Button)findViewById(R.id.button215);
        button215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLLLON",null,null);
            }
        });

        Button button217=(Button)findViewById(R.id.button217);
        button217.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLLLOFF",null,null);
            }
        });

        Button button219=(Button)findViewById(R.id.button219);
        button219.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLLLLON",null,null);
            }
        });

        Button button221=(Button)findViewById(R.id.button221);
        button221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLLLLOFF",null,null);
            }
        });

        Button button223=(Button)findViewById(R.id.button223);
        button223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLBON",null,null);
            }
        });

        Button button224=(Button)findViewById(R.id.button224);
        button224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLBOFF",null,null);
            }
        });

        Button button212=(Button)findViewById(R.id.button212);
        button212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLRON",null,null);
            }
        });

        Button button214=(Button)findViewById(R.id.button214);
        button214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLROFF",null,null);
            }
        });

        Button button216=(Button)findViewById(R.id.button216);
        button216.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLRRON",null,null);
            }
        });

        Button button218=(Button)findViewById(R.id.button218);
        button218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLRROFF",null,null);
            }
        });

        Button button220=(Button)findViewById(R.id.button220);
        button220.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLRRRON",null,null);
            }
        });

        Button button222=(Button)findViewById(R.id.button222);
        button222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUFLRRROFF",null,null);
            }
        });
    }
}

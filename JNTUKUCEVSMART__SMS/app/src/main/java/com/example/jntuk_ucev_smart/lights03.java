package com.example.jntuk_ucev_smart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class lights03 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights03);

        Button button111=(Button)findViewById(R.id.button111);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLLON",null,null);
            }
        });

        Button button113=(Button)findViewById(R.id.button113);
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLLOFF",null,null);
            }
        });

        Button button115=(Button)findViewById(R.id.button115);
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLLLON",null,null);
            }
        });

        Button button117=(Button)findViewById(R.id.button117);
        button117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLLLOFF",null,null);
            }
        });

        Button button119=(Button)findViewById(R.id.button119);
        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLLLLON",null,null);
            }
        });

        Button button121=(Button)findViewById(R.id.button121);
        button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLLLLOFF",null,null);
            }
        });

        Button button123=(Button)findViewById(R.id.button123);
        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLBON",null,null);
            }
        });

        Button button124=(Button)findViewById(R.id.button124);
        button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLBOFF",null,null);
            }
        });

        Button button112=(Button)findViewById(R.id.button112);
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLRON",null,null);
            }
        });

        Button button114=(Button)findViewById(R.id.button114);
        button114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLROFF",null,null);
            }
        });

        Button button116=(Button)findViewById(R.id.button116);
        button116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLRRON",null,null);
            }
        });

        Button button118=(Button)findViewById(R.id.button118);
        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLRROFF",null,null);
            }
        });

        Button button120=(Button)findViewById(R.id.button120);
        button120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLRRRON",null,null);
            }
        });

        Button button122=(Button)findViewById(R.id.button122);
        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage("+917997677305",null,"JUTLRRROFF",null,null);
            }
        });
    }
}

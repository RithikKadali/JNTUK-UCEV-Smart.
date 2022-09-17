//3nd years

String textMessage;

const int left1l=2; //lights pins
const int left2l=3;
const int left3l=4;
const int backl=5;
const int right1l=6;
const int right2l=7;
const int right3l=8;

const int leftf=9;//fans pins
const int bleftf=10;
const int middlef=11;
const int rightf=12;
const int brightf=13;

void setup() 
{
  //setting outpins
pinMode(left1l,OUTPUT);
pinMode(left2l,OUTPUT);
pinMode(left3l,OUTPUT);
pinMode(backl,OUTPUT);
pinMode(right1l,OUTPUT);
pinMode(right2l,OUTPUT);
pinMode(right3l,OUTPUT);

pinMode(leftf,OUTPUT);
pinMode(bleftf,OUTPUT);
pinMode(middlef,OUTPUT);
pinMode(rightf,OUTPUT);
pinMode(brightf,OUTPUT);


//setting default
digitalWrite(left1l,LOW);
digitalWrite(left2l,LOW);
digitalWrite(left3l,LOW);
digitalWrite(backl,LOW);
digitalWrite(right1l,LOW);
digitalWrite(right2l,LOW);
digitalWrite(right3l,LOW);

digitalWrite(leftf,LOW);
digitalWrite(bleftf,LOW);
digitalWrite(middlef,LOW);
digitalWrite(rightf,LOW);
digitalWrite(brightf,LOW);

Serial.begin(19200);
delay(5000);
Serial.print("AT+CMGF=1\r");
}
void loop()
{
 if(Serial.available()>0)
 {
   textMessage=Serial.readString();
   delay(10);
 }
       //lights
       if(textMessage.indexOf("JUTLLON")>=0)
       {
       digitalWrite(left1l,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTLLOFF")>=0)
       {
       digitalWrite(left1l,LOW);
       textMessage="";
       }
       //
       if(textMessage.indexOf("JUTLLLON")>=0)
       {
       digitalWrite(left2l,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTLLLOFF")>=0)
       {
       digitalWrite(left2l,LOW);
       textMessage="";
       }
              //
       if(textMessage.indexOf("JUTLLLLON")>=0)
       {
       digitalWrite(left3l,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTLLLLOFF")>=0)
       {
       digitalWrite(left3l,LOW);
       textMessage="";
       }
            //
       if(textMessage.indexOf("JUTLBON")>=0)
       {
       digitalWrite(backl,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTLBOFF")>=0)
       {
       digitalWrite(backl,LOW);
       textMessage="";
       }
              //
       if(textMessage.indexOf("JUTLRON")>=0)
       {
       digitalWrite(right1l,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTLROFF")>=0)
       {
       digitalWrite(right1l,LOW);
       textMessage="";
       }
              //
       if(textMessage.indexOf("JUTLRRON")>=0)
       {
       digitalWrite(right2l,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTLRROFF")>=0)
       {
       digitalWrite(right2l,LOW);
       textMessage="";
       }
              //
       if(textMessage.indexOf("JUTLRRRON")>=0)
       {
       digitalWrite(right3l,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTLRRROFF")>=0)
       {
       digitalWrite(right3l,LOW);
       textMessage="";
       }


//fans

       //
       if(textMessage.indexOf("JUTFLON")>=0)
       {
       digitalWrite(leftf,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTFLOFF")>=0)
       {
       digitalWrite(leftf,LOW);
       textMessage="";
       }
       //
       if(textMessage.indexOf("JUTFBLON")>=0)
       {
       digitalWrite(bleftf,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTFBLOFF")>=0)
       {
       digitalWrite(bleftf,LOW);
       textMessage="";
       }
       //
       if(textMessage.indexOf("JUTFMON")>=0)
       {
       digitalWrite(middlef,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTFMOFF")>=0)
       {
       digitalWrite(middlef,LOW);
       textMessage="";
       }
              //
       if(textMessage.indexOf("JUTFRON")>=0)
       {
       digitalWrite(rightf,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTFROFF")>=0)
       {
       digitalWrite(rightf,LOW);
       textMessage="";
       }
              //
       if(textMessage.indexOf("JUTFBRON")>=0)
       {
       digitalWrite(brightf,HIGH);
       textMessage="";
       }
       if(textMessage.indexOf("JUTFBROFF")>=0)
       {
       digitalWrite(brightf,LOW);
       textMessage="";
       }
}

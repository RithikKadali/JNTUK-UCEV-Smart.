String textMessage;
const int co=13;
void setup() {
pinMode(co,OUTPUT);
digitalWrite(co,LOW);
Serial.begin(19200);
delay(5000);
Serial.print("AT+CMGF=1\r");
}
void loop() {
if(Serial.available()>0)
{
   textMessage=Serial.readString();
 
   delay(10);
}
if(textMessage.indexOf("ON")>=0){
  digitalWrite(co,HIGH);
  textMessage="";
}
if(textMessage.indexOf("OFF")>=0){
  digitalWrite(co,LOW);
  textMessage="";
}

}

package com.udemy.java.interfacepolymorphism;

public class IPhone implements Alarm {

    public void dial(){
        System.out.println("Caling 123...");
    }

    public void answerPhone(){
        System.out.println("Hello");
    }

    public void setAlarm(){
        System.out.println("IPhone - Setting an alarm @7:30AM");
    }


}

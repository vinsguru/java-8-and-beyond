package com.udemy.java.interfacepolymorphism;

public class GoogleMini implements Alarm{

    public void ask(){
        System.out.println("Hows the weather outside?");
    }

    public void setAlarm(){
        System.out.println("Google Mini - Setting an alarm @7:30AM");
    }

}

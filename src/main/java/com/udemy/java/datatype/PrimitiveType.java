package com.udemy.java.datatype;

public class PrimitiveType {

    public static void main(String[] args) {

        int i = 5;

        System.out.println("Before :: " + i);
        change(i);
        System.out.println("After :: " + i);



    }

                                   //5
    private static void change(int a){
        //6
        a++; //a=a+1
    }


}

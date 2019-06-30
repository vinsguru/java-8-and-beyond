package com.udemy.java.datatype;

import java.util.Arrays;

public class ReferenceType {
    public static void main(String[] args) {

              //abc123
        int[] arr = new int[] {1, 2, 3};


        predict(arr);

        totalSale(arr);

    }

                                 //abc123
    private static void predict(int[] a){
        //def23
        a = Arrays.copyOf(a, a.length);
        a[0]++;
        a[1]++;
        System.out.println("Prediction for next month :: " + (a[0] + a[1] + a[2]));
    }

                                //abc123
    private static void totalSale(int[] a){

        //abc123
        System.out.println("Total Sale for this month :: " + (a[0] + a[1] + a[2]));

    }


}

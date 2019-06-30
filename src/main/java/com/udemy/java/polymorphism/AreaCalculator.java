package com.udemy.java.polymorphism;

public class AreaCalculator {

    //square
    public int getArea(int side){
        return side * side;
    }

    public double getArea(double side){
        return side * side;
    }

    public int getArea(int length, int width){
        return length * width;
    }

    public double getArea(double length, int width){
        return length * width;
    }

}

package com.udemy.calculator;


import java.util.List;
import java.util.function.Consumer;

public class TestMain {

    @FunctionalInterface
    public interface TriConsumer{
        void accept(String a, String b, int c);
    }

    public interface Person{}

    public static void main(String[] args) {

        String exp = "9 * 9 - 1 * 7 / 8 + 30 ^ 2 % 3";

        Calculator.addOperation("^", (a, b) -> (int) Math.pow(a, b));
        Calculator.addOperation("%", (a, b) -> a % b);

        System.out.println(


                Calculator.calculate(exp)


        );


        TriConsumer personProperties = (firstName, lastName, age) -> {   };

        Consumer<Person> person = (p) -> { };





    }

}

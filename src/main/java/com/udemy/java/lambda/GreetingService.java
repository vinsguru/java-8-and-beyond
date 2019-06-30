package com.udemy.java.lambda;

// SAM - single abstract method

@FunctionalInterface
public interface GreetingService {
    String greet(String firstName);
}

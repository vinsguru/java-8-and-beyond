package com.udemy.java.predicate;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Rules {

    private static Predicate<WebElement> isBlank = (e) -> e.getText().trim().length() == 0;
    private static Predicate<WebElement> hasS = (e) -> e.getText().toLowerCase().contains("s");

    public static List<Predicate<WebElement>> get(){
        List<Predicate<WebElement>> r = new ArrayList<>();
        r.add(isBlank);
        r.add(hasS);
        return r;
    }

}

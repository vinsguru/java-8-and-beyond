package com.udemy.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.function.Predicate;

public class TableDemoPage {

    private final WebDriver driver;

    public TableDemoPage(WebDriver driver){
        this.driver = driver;
    }

    public void goTo(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-1.html");
    }

    public void selectRows(Predicate<List<WebElement>> predicate){
        this.driver.findElements(By.tagName("tr")) // rows
                .stream()
                .skip(1)
                .map(tr -> tr.findElements(By.tagName("td")))  // td List
                .filter(tdList -> tdList.size() == 4)
                .filter(predicate)
                .map(tdList -> tdList.get(3))  // td containing chkbox
                .map(td -> td.findElement(By.tagName("input")))
                .forEach(WebElement::click);
    }


}

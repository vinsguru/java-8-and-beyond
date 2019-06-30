package com.udemy.java.test;

import com.udemy.java.supplier.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class DriverTest {

    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser){
        this.driver = DriverFactory.getDriver(browser);
    }

    // https://the-internet.herokuapp.com/broken_images

    @Test
    public void googleTest(){
        this.driver.get("https://google.com/");
        this.driver.findElements(By.tagName("a"))
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .filter(e -> e.length() > 0)
                .filter(e -> !e.toLowerCase().contains("s"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }

}

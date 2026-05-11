package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();

        // REMOVE headless mode if you want browser popup window
        // options.addArguments("--headless=new");

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        // Keep browser open for 10 seconds
        Thread.sleep(10000);

        // Comment this if you want browser to stay open
        // driver.quit();
    }
}

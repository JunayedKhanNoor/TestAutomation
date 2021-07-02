package com.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserConfig {

    public static WebDriver driver;

    public static void main(String[] args) {

        chromeLaunch();
        //chromeClose();
        edgeLaunch();
       // edgeClose();

    }
    /* Browser Launch */
    public static void chromeLaunch() {
        //Set Chrome Driver Path
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
    }

    public static void edgeLaunch(){


        System.setProperty("webdriver.edge.driver","./src/main/resources/msedgedriver.exe");

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        //driver.get("https://apple.com");
        //LocalHost
        //driver.get("http://localhost:8080/myapplication.html");
        driver.get("file:///C:/Users/raghn/OneDrive/Documents/Python&Django_full_stack/HTML/CSS_level_2/capston_project.html");

    }

    public static void chromeClose() {

        driver.close();

    }

    public static void edgeClose() {

        driver.close();
        //driver.quit();

    }

}

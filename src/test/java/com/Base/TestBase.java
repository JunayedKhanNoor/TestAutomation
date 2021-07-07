package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
    public static WebDriver driver;

    public static void main(String[] args) {

        chromeLaunch();
        chromeClose();
        edgeLaunch();
        edgeClose();


    }
    /* Browser Launch */
    public static void chromeLaunch() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void edgeLaunch(){


        System.setProperty("webdriver.edge.driver","./src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();


    }

    public static void chromeClose() {

        driver.close();

    }

    public static void edgeClose() {

        driver.close();


    }

    public static void openTestURL(String URL) {
        driver.get(URL);

    }
}

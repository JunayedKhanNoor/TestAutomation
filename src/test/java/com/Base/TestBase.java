package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public static void chromeClose() { driver.close(); }

    public static void edgeClose() { driver.close(); }

    public static void openTestURL(String URL) { driver.get(URL); }

    public static WebElement elementByCss(String locator) {
        return driver.findElement(By.cssSelector(locator));
    }

    public static WebElement elementByXpath(String locator) {
        return driver.findElement(By.xpath(locator));
    }
    public static WebElement elementByID(String locator) {
        return driver.findElement(By.id(locator));
    }
    public static WebElement elementByName(String locator) {
        return driver.findElement(By.name(locator));
    }

    public static void getElementByCSSandClick(String locator) {
        driver.findElement(By.cssSelector(locator)).click();
    }
    public static void getElementByCSSandType(String locator,String text){
        driver.findElement(By.cssSelector(locator)).sendKeys(text);
    }
    public static void alertAccept(){ driver.switchTo().alert().accept(); }
    public static void alertCancel(){ driver.switchTo().alert().dismiss(); }
}

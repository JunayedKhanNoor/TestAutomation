package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class BrowserOption extends TestBase {
    public static void main(String[] args) {
        //chromeLaunch();
        setBinary();

    }

    public static void setBinary() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions CrOp = new ChromeOptions();
        CrOp.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));
        driver = new ChromeDriver(CrOp);
        driver.get("https://www.codota.com/code/java/methods/org.openqa.selenium.chrome.ChromeOptions/setBinary");


    }
}

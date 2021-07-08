package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest extends TestBase {
    public static void main(String[] args) {
        ChromeHeadless();

    }

    public static void ChromeHeadless() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions CrOp = new ChromeOptions();
        CrOp.setHeadless(true);
        driver = new ChromeDriver(CrOp);
        driver.get("http://demo.guru99.com/");
        System.out.println("Title is : "+driver.getTitle());

    }
}

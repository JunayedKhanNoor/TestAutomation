package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSL extends TestBase {
    public static void main(String[] args) {
        insecurityTest();
    }

    public static void insecurityTest() {
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        ChromeOptions CrOp = new ChromeOptions();
        CrOp.setAcceptInsecureCerts(true);
        driver = new ChromeDriver(CrOp);
        driver.get("https://cacert.org/");
        String TitleAfterAccept = driver.getTitle();
        System.out.println(TitleAfterAccept);

    }
}

package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Login extends TestBase {
    public static void main(String[] args) throws IOException {
        chromeLaunch();
        TC_01_Valid();
        //takeScreenshot("loginTest");
        TC_02_inValid();
        //chromeClose();


    }

    public static void TC_01_Valid() {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail.com");
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");
        WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();
        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();


    }
    public static void TC_02_inValid() {
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("user101@gmail");
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123456");
        WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
        LoginBtn.click();

    }
}

package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register extends TestBase {
    public static void main(String[] args) {
        chromeLaunch();
        TC_01_valid();

    }

    public static void TC_01_valid() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement First_name = driver.findElement(By.id("input-firstname"));
        First_name.sendKeys("Cristiano");
        WebElement Last_name = driver.findElement(By.id("input-lastname"));
        Last_name.sendKeys("Ronaldo");
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("cr7thegoat@gmail.com");
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("00234625178");
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("12345");
        WebElement Confirm_password = driver.findElement(By.id("input-confirm"));
        Confirm_password.sendKeys("12345");
        WebElement ClickOnAgree = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        ClickOnAgree.click();
        WebElement ClickContinue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        ClickContinue.click();

    }
}

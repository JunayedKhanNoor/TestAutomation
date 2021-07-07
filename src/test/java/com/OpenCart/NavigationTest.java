package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationTest extends TestBase {
    public static void main(String[] args) {
        chromeLaunch();
        openTestURL("https://demo.opencart.com/");
        navigateTo("https://demo.opencart.com/index.php?route=account/register");
        inputOnRegisterPage();
        navigateBack();
        navigateForward();
    }

    public static void navigateTo(String URL) {
        driver.navigate().to(URL);
        System.out.println("Navigated to : "+driver.getTitle());

    }

    public static void inputOnRegisterPage() {
        WebElement First_name = driver.findElement(By.id("input-firstname"));
        First_name.sendKeys("asdfghjklzxcvbnmqwertyuiopasdfghj");
        WebElement Last_name = driver.findElement(By.id("input-lastname"));
        Last_name.sendKeys("asdfghjklzxcvbnmqwertyuiopasdfghj");
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("");
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("1236767666666666666661127233127831");
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("123676766666666666666");
        WebElement Confirm_password = driver.findElement(By.id("input-confirm"));
        Confirm_password.sendKeys("123676766666666666666");

    }

    public static void navigateBack() {
        driver.navigate().back();
        System.out.println("Navigated back to : "+driver.getTitle());

    }
    public static void navigateForward() {
        driver.navigate().forward();
        System.out.println("Navigated back to : "+driver.getTitle());

    }

}

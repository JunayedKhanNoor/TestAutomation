package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;

import java.util.Locale;

public class DynamicRegistration extends TestBase {
    public static void main(String[] args) {
        chromeLaunch();
        openTestURL("https://demo.opencart.com/index.php?route=common/home");
        doRegistrationAndEndToEndCheck();
    }



    public static void doRegistrationAndEndToEndCheck() {
        openTestURL("https://demo.opencart.com/index.php?route=account/register");
        //Generate first name and last name and email
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = firstName.toLowerCase(Locale.ROOT)+lastName.toLowerCase(Locale.ROOT)+"@gmail.com";

        //Give your information data
        WebElement First_name = driver.findElement(By.id("input-firstname"));
        First_name.sendKeys(firstName);
        WebElement Last_name = driver.findElement(By.id("input-lastname"));
        Last_name.sendKeys(lastName);
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys(email);
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("00234625");
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("12345");
        WebElement Confirm_password = driver.findElement(By.id("input-confirm"));
        Confirm_password.sendKeys("12345");
        WebElement ClickOnAgree = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        ClickOnAgree.click();
        WebElement ClickContinue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        ClickContinue.click();
        WebElement LoginContinue =driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a"));
        LoginContinue.click();
        //logout

        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();

        //login
        openTestURL("https://demo.opencart.com/index.php?route=account/login");
        WebElement EmailAdress = driver.findElement(By.id("input-email"));
        EmailAdress.sendKeys(email);
        WebElement EnterPassword = driver.findElement(By.id("input-password"));
        EnterPassword.sendKeys("12345");
        WebElement Log = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]"));
        Log.click();



    }

}

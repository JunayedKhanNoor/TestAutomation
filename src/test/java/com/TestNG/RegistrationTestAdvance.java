package com.TestNG;

import com.Utils.Log;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Locale;

public class RegistrationTestAdvance {
    WebDriver driver;
    String Url="https://demo.opencart.com/index.php?route=account/register";
    @BeforeSuite
    public void initSetup(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Log.info("Chrome Launch Successfully");
        driver.get(Url);
        Log.info("Registration Page Open Successfully");
    }
    @AfterSuite
    public void tearDown(){
        driver.close();
        Log.info("Chrome Closed Successfully");

    }
    @Test
    public void advanceRegistration(){
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
        String Exp_Title="My Account";
        String Act_Title=driver.getTitle();
        Log.info(Act_Title);


        //Assertion
        Assert.assertEquals(Exp_Title,Act_Title);
        Log.info("Registration Successful");
        //logout

        WebElement Logout = driver.findElement(By.linkText("Logout"));
        Logout.click();
        Log.info("Logout Successful");

        //login
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        WebElement EmailAdress = driver.findElement(By.id("input-email"));
        EmailAdress.sendKeys(email);
        WebElement EnterPassword = driver.findElement(By.id("input-password"));
        EnterPassword.sendKeys("12345");
        WebElement log = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]"));
        log.click();
        Log.info("Login Successful");



    }
}

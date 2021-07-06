package com.OpenCart;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Register extends TestBase {
    public static void main(String[] args) {
        chromeLaunch();
        //TC_01_valid();
       // TC_02_invalid();
        TC_03_invalid();

    }

    public static void TC_01_valid() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement First_name = driver.findElement(By.id("input-firstname"));
        First_name.sendKeys("Cristiano");
        WebElement Last_name = driver.findElement(By.id("input-lastname"));
        Last_name.sendKeys("Ronaldo");
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("cr07thegoat@gmail.com");
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
        //Registration pass
        String Exp_url = "https://demo.opencart.com/index.php?route=account/success";
        String Act_url = driver.getCurrentUrl();
        if(Exp_url.equals(Act_url)){
            System.out.println("Test passed for valid Data");
        }
        else{
            System.out.println("Yahoo Bug found , Test failed for valid Data");
        }


    }


    public static void TC_02_invalid() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");
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
        WebElement ClickOnAgree = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        ClickOnAgree.click();
        WebElement ClickContinue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        ClickContinue.click();
        //Registration pass for First Name
        String Exp_fName_ValidationMessage = "First Name must be between 1 and 32 characters!";
        String Act_fName_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(3) > div > div")).getText();
        if(Exp_fName_ValidationMessage.equals(Act_fName_ValidationMessage)){
            System.out.println("First name validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in First Name");
        }
        // Last Name validation
        String Exp_lName_ValidationMessage = "Last Name must be between 1 and 32 characters!";
        String Act_lName_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(4) > div > div")).getText();
        if(Exp_lName_ValidationMessage.equals(Act_lName_ValidationMessage)){
            System.out.println("Last name validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Last Name");
        }
        //Email validation
        String Exp_email_ValidationMessage = "E-Mail Address does not appear to be valid!";
        String Act_email_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(5) > div > div")).getText();
        if(Exp_email_ValidationMessage.equals(Act_email_ValidationMessage)){
            System.out.println("Email validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Email field");
        }
        //Telephone validation
        String Exp_Telephone_ValidationMessage = "Telephone must be between 3 and 32 characters!";
        String Act_Telephone_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(6) > div > div")).getText();
        if(Exp_Telephone_ValidationMessage.equals(Act_Telephone_ValidationMessage)){
            System.out.println("Telephone validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Telephone field");
        }
        //Password Validation
        String Exp_password_ValidationMessage = "Password must be between 4 and 20 characters!";
        String Act_password_ValidationMessage = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(2) > div.form-group.required.has-error > div > div")).getText();
        if(Exp_password_ValidationMessage.equals(Act_password_ValidationMessage)){
            System.out.println("Password validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Password field");
        }



    }

    public static void TC_03_invalid() {
        driver.get("https://demo.opencart.com/index.php?route=account/register");
        WebElement First_name = driver.findElement(By.id("input-firstname"));
        First_name.sendKeys("");
        WebElement Last_name = driver.findElement(By.id("input-lastname"));
        Last_name.sendKeys("");
        WebElement Email = driver.findElement(By.id("input-email"));
        Email.sendKeys("");
        WebElement Telephone = driver.findElement(By.id("input-telephone"));
        Telephone.sendKeys("12");
        WebElement Password = driver.findElement(By.id("input-password"));
        Password.sendKeys("16");
        WebElement Confirm_password = driver.findElement(By.id("input-confirm"));
        Confirm_password.sendKeys("16");
        WebElement ClickOnAgree = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        ClickOnAgree.click();
        WebElement ClickContinue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
        ClickContinue.click();
        //Registration pass for First Name
        String Exp_fName_ValidationMessage = "First Name must be between 1 and 32 characters!";
        String Act_fName_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(3) > div > div")).getText();
        if(Exp_fName_ValidationMessage.equals(Act_fName_ValidationMessage)){
            System.out.println("First name validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in First Name");
        }
        // Last Name validation
        String Exp_lName_ValidationMessage = "Last Name must be between 1 and 32 characters!";
        String Act_lName_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(4) > div > div")).getText();
        if(Exp_lName_ValidationMessage.equals(Act_lName_ValidationMessage)){
            System.out.println("Last name validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Last Name");
        }
        //Email validation
        String Exp_email_ValidationMessage = "E-Mail Address does not appear to be valid!";
        String Act_email_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(5) > div > div")).getText();
        if(Exp_email_ValidationMessage.equals(Act_email_ValidationMessage)){
            System.out.println("Email validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Email field");
        }
        //Telephone validation
        String Exp_Telephone_ValidationMessage = "Telephone must be between 3 and 32 characters!";
        String Act_Telephone_ValidationMessage = driver.findElement(By.cssSelector("#account > div:nth-child(6) > div > div")).getText();
        if(Exp_Telephone_ValidationMessage.equals(Act_Telephone_ValidationMessage)){
            System.out.println("Telephone validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Telephone field");
        }
        //Password Validation
        String Exp_password_ValidationMessage = "Password must be between 4 and 20 characters!";
        String Act_password_ValidationMessage = driver.findElement(By.cssSelector("#content > form > fieldset:nth-child(2) > div.form-group.required.has-error > div > div")).getText();
        if(Exp_password_ValidationMessage.equals(Act_password_ValidationMessage)){
            System.out.println("Password validation passed");
        }
        else {
            System.out.println("Yahoo, Bug detected in Password field");
        }



    }

}

package com.Frames;

import com.Base.TestBase;
import io.netty.util.collection.ByteObjectMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameHomeWork extends TestBase {
    public static void main(String[] args) {
        chromeLaunch();
        openTestURL("https://www.w3schools.com/html/html_iframe.asp");
        clickOnCSS();
    }
    public static void clickOnCSS() {
        WebElement iFrame = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/iframe"));
        driver.switchTo().frame(iFrame);
        WebElement CSS = driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div/a[4]"));
        CSS.click();

    }
}

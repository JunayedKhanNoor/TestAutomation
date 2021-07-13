package com.Frames;

import com.Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFramesTest extends TestBase {
    public static void main(String[] args) {
        chromeLaunch();
        openTestURL("https://the-internet.herokuapp.com/iframe");
        singleFrame();
    }

    public static void singleFrame() {
        driver.switchTo().frame("mce_0_ifr");
        WebElement iFrameTextArea = driver.findElement(By.id("tinymce"));
        iFrameTextArea.clear();
        iFrameTextArea.sendKeys("Hello,Its working ");
    }
}

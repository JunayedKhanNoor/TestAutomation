package com.config;

import org.openqa.selenium.Dimension;

public class BrowserSize extends BrowserConfig {
    public static void main(String[] args) {
        chromeLaunch();
        getScreenSize();
        Screen_tab();
        getScreenSize();
    }

    public static void getScreenSize() {

        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        System.out.println("Scren widht: "+width +" and height: "+height);

    }

    public static void Screen_tab() {

        //set window size
        driver.manage().window().setSize(new Dimension(500,400));

    }
}

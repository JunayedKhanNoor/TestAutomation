package com.Screenshot;

import com.Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BbcFullPage extends TestBase {
    public static void main(String[] args) throws IOException {
        chromeLaunch();
        openTestURL("https://www.bbc.com/");
        //Wait for page load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //page scroll
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //Full page screenshot
        Screenshot screenshot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(),"PNG",new File("./src/test/Screenshots/BBC_FullPage.png"));

    }
}

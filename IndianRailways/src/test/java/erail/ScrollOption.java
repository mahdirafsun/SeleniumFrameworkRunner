package erail;


import Testing.CommoneApi;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.Test;

import java.io.File;

public class ScrollOption extends CommoneApi{
    @Test
    public void Scrolling() throws Exception {
        driver.findElement(By.cssSelector("#txtStationFrom")).sendKeys("MS" + Keys.TAB);
        driver.findElement(By.cssSelector("#txtStationTo")).sendKeys("TP" + Keys.TAB);
        sleep(4);

        WebElement element = driver.findElement(By.xpath(".//*[@id='divTrainsListTrainsObj']/table[1]/tbody/tr[31]/td[2]/a"));
       sleep(3);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenShort.jpg"));
        Coordinates coordinates = ((Locatable)element).getCoordinates();
        sleep(3);
        coordinates.inViewPort();
        sleep(3);
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile1, new File("screenShort1.jpg"));
    }
}

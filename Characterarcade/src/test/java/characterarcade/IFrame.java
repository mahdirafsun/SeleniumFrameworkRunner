package characterarcade;


import Testing.CommoneApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrame extends CommoneApi{

    @Test
    public void IFrame() throws InterruptedException {

        driver.findElement(By.cssSelector(".login_btn")).click();

        WebElement element = driver.findElement(By.cssSelector("#surf-xdm iframe:nth-child(1)"));
        driver.switchTo().frame(element);
        WebElement element1 = driver.findElement(By.cssSelector("#display-frame"));
        driver.switchTo().frame(element1);
        sleep(5);

        driver.findElement(By.xpath(".//*[@id='input_username']")).sendKeys("salahakanda@gmail.com");

        driver.findElement(By.xpath(".//*[@id='input_password']")).sendKeys("0u865");
        sleep(4);
        driver.findElement(By.xpath(".//*[@id='button_submit']")).click();
        sleep(4);
        driver.findElement(By.xpath(".//*[@id='header']/div")).click();

        driver.switchTo().defaultContent();
        sleep(2);
        clickOnCss(".cufon.cufon-canvas>canvas");


        // Not using common Api
//        driver.findElement(By.cssSelector(".login_btn")).click();
//
//        WebElement element = driver.findElement(By.cssSelector("#surf-xdm iframe:nth-child(1)"));
//        driver.switchTo().frame(element);
//        WebElement element1 = driver.findElement(By.cssSelector("#display-frame"));
//        driver.switchTo().frame(element1);
//        sleep(5);
//
//        driver.findElement(By.xpath(".//*[@id='input_username']")).sendKeys("salahakanda@gmail.com");
//
//        driver.findElement(By.xpath(".//*[@id='input_password']")).sendKeys("0u865");
//        sleep(4);
//        driver.findElement(By.xpath(".//*[@id='button_submit']")).click();
//        sleep(4);
//        driver.findElement(By.xpath(".//*[@id='header']/div")).click();
//
//        driver.switchTo().defaultContent();


    }
}

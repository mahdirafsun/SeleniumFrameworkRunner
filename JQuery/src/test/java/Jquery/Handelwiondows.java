package Jquery;

import Testing.CommoneApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

/**
 * Created by salahakanda on 1/6/15.
 */
public class Handelwiondows extends CommoneApi {

    @Test
    public void test() throws InterruptedException {

        driver.findElement(By.xpath(".//*[@id='broadcast']/a/img")).click();
        String homewindow = driver.getWindowHandle();
        Set<String> homewindow1 = driver.getWindowHandles();
        for (String hnd : homewindow1) {
            if (!hnd.equals(homewindow)) {
                driver.switchTo().window(hnd);
            }
        }

        System.out.println(driver.getTitle());
        sleep(4);
        driver.close();
        driver.switchTo().window(homewindow);
        System.out.println(driver.getTitle());
        sleep(5);


        List<WebElement> list = getListOfWebElement("#menu-top li");
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size()) {
                list.get(i).findElement(By.tagName("a")).click();
                sleep(5);
            }
            navigateBack();
            list = getListOfWebElement("#menu-top li");


        }

        // Not using common Api

//        driver.findElement(By.xpath(".//*[@id='broadcast']/a/img")).click();
//        String homewindow = driver.getWindowHandle();
//        Set<String> homewindow1 = driver.getWindowHandles();
//        for (String hnd : homewindow1) {
//            if (!hnd.equals(homewindow)) {
//                driver.switchTo().window(hnd);
//            }
//        }
//
//        System.out.println(driver.getTitle());
//        Thread.sleep(4000);
//        driver.close();
//        driver.switchTo().window(homewindow);
//        System.out.println(driver.getTitle());
//        Thread.sleep(4000);
//
//
//        List<WebElement> list = driver.findElements(By.cssSelector("#menu-top li"));
//        for (int i = 0; i < list.size(); i++) {
//            if (i < list.size()) {
//                list.get(i).findElement(By.tagName("a")).click();
//                Thread.sleep(4000);
//            }
//            driver.navigate().back();
//            list = getListOfWebElement("#menu-top li");
//
//
//        }

    }
}

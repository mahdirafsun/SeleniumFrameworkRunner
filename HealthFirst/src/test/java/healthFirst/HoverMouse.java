package healthFirst;


import Testing.CommoneApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class HoverMouse extends CommoneApi {
    @Test
    public void test()throws Exception{

        WebElement element = getWebElement1(".//*[@id='topnav']/ul/li[1]/h2/a");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        List<WebElement> list = getListOfWebElement1(".//*[@id='topnav']/ul/li[1]/div/div[1]/ul[1]/li");
        for (int i =0; i<list.size(); i++){
            if (i<list.size()){
                list.get(i).findElement(By.tagName("a")).click();
                sleep(5);
            }
            navigateBack();
            list = getListOfWebElement1(".//*[@id='topnav']/ul/li[1]/div/div[1]/ul[1]/li");
            WebElement element1 = getWebElement1(".//*[@id='topnav']/ul/li[1]/h2/a");
            Actions actions1 = new Actions(driver);
            actions1.moveToElement(element1).perform();


        }


        //Not using common Api

//        WebElement element = driver.findElement(By.xpath(".//*[@id='topnav']/ul/li[1]/h2/a"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();
//
//        List<WebElement> list = driver.findElements(By.xpath(".//*[@id='topnav']/ul/li[1]/div/div[1]/ul[1]/li"));
//        for (int i =0; i<list.size(); i++){
//            if (i<list.size()){
//                list.get(i).findElement(By.tagName("a")).click();
//                sleep(5);
//            }
//            driver.navigate().back();
//            list = driver.findElements(By.xpath(".//*[@id='topnav']/ul/li[1]/div/div[1]/ul[1]/li"));
//            WebElement element1 = driver.findElement(By.xpath(".//*[@id='topnav']/ul/li[1]/h2/a"));
//            Actions actions1 = new Actions(driver);
//            actions1.moveToElement(element1).perform();
//
//        }





    }
}

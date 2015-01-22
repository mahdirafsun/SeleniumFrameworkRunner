package metLife;

import Testing.CommoneApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by salahakanda on 1/12/15.
 */
public class YourInfo extends CommoneApi{
    @Test
    public  void yourInfo() throws InterruptedException {
        WebElement element = getWebElement1(".//*[@id='state1-mmquote']");
        Select select = new Select(element);
        select.selectByValue("NY");
        sleep(1);
        WebElement element6 = driver.findElement(By.xpath(".//*[@id='month-mmquote']"));
        Select select6 = new Select(element6);
        select6.selectByIndex(6);
        sleep(1);
        WebElement element2 = getWebElement1(".//*[@id='day-mmquote']");
        Select select2 = new Select(element2);
        select2.selectByIndex(15);
        sleep(1);
        WebElement element3 = getWebElement1(".//*[@id='year-mmquote']");
        Select select3 = new Select(element3);
        select3.selectByIndex(5);
        sleep(1);
        WebElement element4 = getWebElement1(".//*[@id='gender-mmquote']");
        Select select4 = new Select(element4);
        select4.selectByValue("M");
        sleep(1);
        WebElement element5 = getWebElement1(".//*[@id='coverage-mmquote']");
        Select select5 = new Select(element5);
        select5.selectByIndex(2);
        sleep(1);
        WebElement element7 = getWebElement1(".//*[@id='term-mmquote']");
        Select select7 = new Select(element7);
        select7.selectByIndex(1);
        sleep(1);
        WebElement element8 = getWebElement1(".//*[@id='tobacco-mmquote']");
        Select select8 = new Select(element8);
        select8.selectByIndex(1);
        sleep(1);
        WebElement element9 = getWebElement1(".//*[@id='health-mmquote']");
        Select select9 = new Select(element9);
        select9.selectByIndex(1);
        sleep(1);
        clickOnXpath(".//*[@id='submitBtnImage']");
        sleep(1);
        String text = driver.findElement(By.xpath(".//*[@id='mm-premium']/span")).getText();
        System.out.println("Here's your quotel:- " + text );







    }
}

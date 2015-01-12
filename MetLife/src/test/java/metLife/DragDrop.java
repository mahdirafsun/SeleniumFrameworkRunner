package metLife;

import Testing.CommoneApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by salahakanda on 1/12/15.
 */
public class DragDrop extends CommoneApi{
    @Test
    public void dragDrop() throws Exception{

        WebElement webElement = getWebElement1(".//*[@id='hdMenuDiv']/ul/li[5]/a");
        sleep(4);
        WebElement webElement1 = getWebElement1(".//*[@id='form-refineSearchQuery']");
        sleep(4);
        Actions action = new Actions(driver);
        action.clickAndHold(webElement).moveToElement(webElement1).perform();
        sleep(4);
        clickOnXpath(".//*[@id='metSearchForm']/div/div[1]/div[2]/input");
        sleep(4);
    }
}

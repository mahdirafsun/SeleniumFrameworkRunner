package amazon;


import Testing.CommoneApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;


public class DropDownList extends CommoneApi {

    @Test
    public void DropDownList() throws Exception{
//        WebElement element = getWebElement1(".//*[@id='searchDropdownBox']");
//        List<WebElement> list = getListOfWebElement1(".//*[@id='searchDropdownBox']/option");
//        List<String> list1 = getListOfText(list);
//        for(int i=0; i<list.size(); i++){
//            if (i<list.size()){
//                selectElementByOption(element, list1.get(i) );
//                sleep(4);
//            }
//            navigateBack();
//            element = getWebElement1(".//*[@id='searchDropdownBox']");
//        }
// not using common Api
//        WebElement element2 = driver.findElement(By.xpath(".//*[@id='searchDropdownBox']"));
//        Select select = new Select(element2);
//        List<WebElement> webElements = select.getOptions();
//        for (int i=0; i<webElements.size(); i++){
//            webElements.get(i).click();
//            Thread.sleep(3000);
//        }


        // we can use also this way
        WebElement element = getWebElement1(".//*[@id='searchDropdownBox']");
        List<WebElement> list = getListOfWebElement1(".//*[@id='searchDropdownBox']/option");
        for(int i=0; i<list.size(); i++){
            if (i<list.size()){
                list.get(i).click();
                sleep(4);
            }

        }

    }
}

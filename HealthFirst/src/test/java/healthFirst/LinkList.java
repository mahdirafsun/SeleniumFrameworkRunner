package healthFirst;

import Testing.CommoneApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LinkList extends CommoneApi {

    @Test
    public void findLink(){
        List<WebElement> list = driver.findElements(By.tagName("a"));

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getAttribute("href"));
            System.out.println(list.get(i));
        }
        System.out.println(list.size());




    }

}

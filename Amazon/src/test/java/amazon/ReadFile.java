package amazon;


import Testing.CommoneApi;
import Testing.DataReader;
import org.testng.annotations.Test;

public class ReadFile extends CommoneApi {

    DataReader dataReader = new DataReader();
    String[][] locators;

    @Test
    public void runFile() throws  Exception{
         String path = ("/Users/salahakanda/Documents/Data1.xls");
        locators = dataReader.read(path);
        System.out.println(locators.length);
        for (int i=0; i<locators.length; i++){
            for (int j=1; j<2; j++){
                String locator= locators[i][j];
                clickOnXpath(locator);
            }
        }
    }

}

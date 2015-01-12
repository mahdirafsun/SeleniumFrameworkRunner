package Jquery;

import Testing.CommoneApi;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class MultipleScreenShort extends CommoneApi {

    @Test
    public void screenShort() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenShort.jpg"));
    }
}

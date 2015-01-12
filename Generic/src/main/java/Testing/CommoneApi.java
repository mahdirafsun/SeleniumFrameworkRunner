package Testing;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommoneApi {

    public WebDriver driver = null;
    @Parameters ({"useSauceLabs","url","OS","browserName","browserVersion","userName","key"})
    @BeforeMethod //............................
    public void navigationUrl(@Optional("false")boolean useSauceLabs,@Optional("http://www.cnn.com")String url,
                              @Optional("Windows 7")String OS,
                              @Optional("firefox")String browserName, @Optional("22")String browserVersion,
                              @Optional("akanda_salahuddin")String userName, @Optional("b5e11a4f-f9a3-4d95-b2a6-24b3984ac9bb")
    String key)throws IOException{
        if(useSauceLabs==true){
            getSauceLabsDriver(OS,browserName,browserVersion,userName,key);
        }else{
            getLocalDriver(browserName);
        }
        //driver = getLocalDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    //All Browser............................
    public WebDriver getLocalDriver(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/salahakanda/Documents/chromedriver");
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }else if(browser.equalsIgnoreCase("iexplore")){
            driver = new InternetExplorerDriver();
        }
        return driver;
    }

    @AfterMethod //..................................
    public void closeUrl(){
        driver.close();

    }

    //All  method
    //Saucelabs driver
    public WebDriver getSauceLabsDriver(String os, String browserName, String browserVersion, String userName,
                                        String key)throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platform", os);
        cap.setBrowserName(browserName);
        cap.setVersion(browserVersion);
        this.driver = new RemoteWebDriver(new URL("http://"+userName+":"+key
                +"@ondemand.saucelabs.com:80/wd/hub"), cap);
        return driver;
    }

    //Click

    public void clickOnCss(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void clickOnXpath(String locator){
        driver.findElement(By.xpath(locator)).click();
    }
    public void clickOnId(String locator){
        driver.findElement(By.id(locator)).click();
    }
    public void clickOnName(String locator){
        driver.findElement(By.name(locator)).click();
    }

    //type.......................................
    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);

    }
    public void typeByXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);

    }

    public void sendKeyCss(String locator, String key){
        driver.findElement(By.cssSelector(locator)).sendKeys(key);
    }
    // Get the WebElement
    public WebElement getWebElement(String locator){
        WebElement element = driver.findElement(By.cssSelector(locator));
        return element;
    }
    public void mouseControl(String element){

    }


    public WebElement getWebElement1(String locator){
        WebElement element1 = driver.findElement(By.xpath(locator));
        return element1;
    }
    public void mouseControl1(String element1){

    }

    //Get the WebElements
    public List<WebElement> getListOfWebElement(String locator){
        List<WebElement> list = driver.findElements(By.cssSelector(locator));

        return list;
    }
    public List<WebElement> getListOfWebElement1(String locator){
        List<WebElement> list = driver.findElements(By.xpath(locator));

        return list;
    }

    //Array List
    public List<String> getListOfText(List<WebElement> list){
        List<String> text = new ArrayList<String>();
        for(WebElement element:list){
            text.add(element.getText());
        }

        return text;
    }

    // Select Method
    public void selectElementByOption(WebElement element, String value){
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }
    public static void selectElementByOption(WebElement element){
        Select select = new Select(element);

    }


    //Alert handling.....................................
    public void okAlert(String locator){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert(String locator){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }



    //Syncronization...............................
    public void waitUntilVisible(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public void waitUntilClickable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

    }
    public void waitUntilSelectable(By locator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        boolean element = wait.until(ExpectedConditions.elementToBeSelected(locator));

    }


    // Navigation Back
    public void navigateBack(){
        driver.navigate().back();
    }

    // Sleep Method
    public void sleep(int seconds)throws InterruptedException{
        Thread.sleep(1000*seconds);
    }

    //Action

    public void action(){
        Actions actions = new Actions(driver);
    }

    // Get the text
    public String getTheText(String locator){
        return driver.findElement(By.xpath(locator)).getText();

    }


}





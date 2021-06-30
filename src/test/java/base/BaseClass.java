package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver = null;

    @BeforeClass
    public void asinit(){
        System.setProperty("webdriver.chrome.driver", "/Users/jewal/Desktop/learning/seleniumClass13/driver/chromedriver 4");
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void init() {
        driver.get("https://www.google.com");

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }


    @AfterClass
    public void finalTearDown(){
        driver.quit();
    }

}






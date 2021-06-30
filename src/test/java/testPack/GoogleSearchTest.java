package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base.BaseClass;

import static org.testng.Assert.assertEquals;

public class GoogleSearchTest extends BaseClass {


    @Test // fail
    public void testMethod() {

        WebElement inputFiled = driver.findElement(By.xpath("//input[@name='q']"));

        inputFiled.sendKeys("samsung", Keys.ENTER);

        String str = driver.findElement(By.xpath("(//input[@name='q'])[1]")).getAttribute("value");

        System.out.println(str);

        assertEquals(str, "iphone");

    }

    @Test
    public void testMethod2() {

        WebElement inputFiled = driver.findElement(By.xpath("//input[@name='q']"));

        inputFiled.sendKeys("iphone", Keys.ENTER);

        String str = driver.findElement(By.xpath("(//input[@name='q'])[1]")).getAttribute("value");

        System.out.println(str);

        assertEquals(str, "iphone");

    }

    @Test
    public void testMethod3() {

        WebElement inputFiled = driver.findElement(By.xpath("//input[@name='q']"));

        inputFiled.sendKeys("LG", Keys.ENTER);

        String str = driver.findElement(By.xpath("(//input[@name='q'])[1]")).getAttribute("value");

        System.out.println(str);

        assertEquals(str, "LG");

    }
}

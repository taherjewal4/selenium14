package testPack;

import facebooklogin.FaceBookLoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.BaseClass;

public class FacebookTest extends BaseClass {
    public static FaceBookLoginPage faceBookLoginPage = null;

    @BeforeClass
    public void init() {
        faceBookLoginPage = PageFactory.initElements(driver, FaceBookLoginPage.class);
        driver.get("https://www.facebook.com/login");
    }

    @Test
    public void facebookLoginPageTest() throws InterruptedException {
        faceBookLoginPage
                .setEmail("testEmail")
                .setPassword("34556tyuhjbnb")
                .clickLoginBtn();
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
    }

    @Test
    public void facebookWrongLoginPageTest() throws InterruptedException {
        faceBookLoginPage
                .setEmail("wrongEmail")
                .setPassword("34556tyuhjbnb")
                .clickLoginBtn();
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
    }
}

package facebooklogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FaceBookLoginPage {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(id = "loginbutton")
    WebElement loginbtn;

    @FindBy(css = "._9lsb _9ls9")
    WebElement showPassbtn;

    @FindBy(className = "_97w4")
    WebElement forgetacc;

    @FindBy(id = "")
    WebElement createacc;

    private void fillFiled(WebElement element,String value){
        element.clear();
        element.sendKeys(value);
    }

    public FaceBookLoginPage clickLoginBtn(){
        loginbtn.click();
        return this;
    }

    public FaceBookLoginPage setEmail(String value){
        fillFiled(email,value);
        return this;
    }

    public FaceBookLoginPage setPassword(String value){
        fillFiled(password,value);
        return this;
    }

    public FaceBookLoginPage clickOnCreateAccBtn(){
        createacc.click();
        return this;
    }

    public void clickShowPass(){
        showPassbtn.click();
    }
}
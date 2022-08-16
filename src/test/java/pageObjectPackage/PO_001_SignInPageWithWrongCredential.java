package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_001_SignInPageWithWrongCredential {
    WebDriver driver = null;
    String msg = null;

    //Constructor creation
    public PO_001_SignInPageWithWrongCredential(WebDriver driver){
        this.driver = driver;
    }

    //Variable to get web element from the page
    By username = By.id("inputUsername");
    By password = By.name("inputPassword");
    By clickOnSignInBtn = By.className("signInBtn");
    By getErrorMsg = By.cssSelector("p.error");
    By clickOnForgotPass = By.linkText("Forgot your password?");

    //Method to perform action in the page
    public void putUsername(){
        driver.findElement(username).sendKeys("arshad");
    }
    public void putPassword(){
        driver.findElement(password).sendKeys("ars789");
    }
    public void clickOnSignInButton(){
        driver.findElement(clickOnSignInBtn).click();
    }
    public void errorMsg(){
        msg = driver.findElement(getErrorMsg).getText();
    }
    public void clickOnForgotPassword(){
        if(msg.equals("* Incorrect username or password")){
            driver.findElement(clickOnForgotPass).click();
        }
    }

}

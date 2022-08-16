package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_002_ForgotPasswordPage {
    WebDriver driver = null;

    //Constructor creation
    public PO_002_ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    //Variable to get web element from the page
    By name = By.xpath("//input[@placeholder='Name']");
    By email = By.xpath("//input[@type='text'][2]");
    By phone = By.xpath("//input[@type='text'][3]");
    By resetLogInBtn = By.cssSelector(".reset-pwd-btn");
    By gotoLogInBtn = By.xpath("//button[normalize-space()='Go to Login']");

    //Method to perform action in the page
    public void userName(){
        driver.findElement(name).sendKeys("arshad");
    }
    public void email(){
        driver.findElement(email).sendKeys("ar@rahulshettyacademy.com");
    }
    public void phoneNumber(){
        driver.findElement(phone).sendKeys("01234567890");
    }
    public void clickOnResetLogInButton(){
        driver.findElement(resetLogInBtn).click();
    }
    public void clickOnGotoLogInButton(){
        driver.findElement(gotoLogInBtn).click();
    }
}

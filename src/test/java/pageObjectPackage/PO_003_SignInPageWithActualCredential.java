package pageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_003_SignInPageWithActualCredential {
    WebDriver driver = null;

    //Constructor creation
    public PO_003_SignInPageWithActualCredential(WebDriver driver){
        this.driver = driver;
    }

    //Variable to get web element from the page
    By username = By.cssSelector("#inputUsername");
    By password = By.cssSelector("input[placeholder='Password']");
    By checkBox = By.name("chkboxTwo");
    By clickOnSignInBtn = By.className("signInBtn");
    By clickOnLogoutBtn = By.xpath("//button[normalize-space()='Log Out']");

    //Method to perform action in the page
    public void inputUsername(){
        driver.findElement(username).sendKeys("Tanvir");
    }
    public void inputPassword(){
        driver.findElement(password).sendKeys("rahulshettyacademy");
    }
    public void clickOnCheckBox(){
        driver.findElement(checkBox).click();
    }
    public void clickOnSignInButton(){
        driver.findElement(clickOnSignInBtn).click();
    }
    public void clickOnLogoutButton(){
        driver.findElement(clickOnLogoutBtn).click();
    }
}

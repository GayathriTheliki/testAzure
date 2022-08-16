package testCasePackage;

import driverPackage.BaseDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjectPackage.PO_001_SignInPageWithWrongCredential;
import pageObjectPackage.PO_002_ForgotPasswordPage;
import pageObjectPackage.PO_003_SignInPageWithActualCredential;

import java.time.Duration;

public class TC_001_SignIn extends BaseDriver {
    public static String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
    @Test
    public static void SignIn() throws InterruptedException {
        driver.get(baseUrl);
        new WebDriverWait(driver, Duration.ofSeconds(10));

        //Objects of pages
        PO_001_SignInPageWithWrongCredential signInWithWrongCredential = new PO_001_SignInPageWithWrongCredential(driver);
        PO_002_ForgotPasswordPage setNewInfo = new PO_002_ForgotPasswordPage(driver);
        PO_003_SignInPageWithActualCredential signInWithActualCredential = new PO_003_SignInPageWithActualCredential(driver);

        signInWithWrongCredential.putUsername();
        signInWithWrongCredential.putPassword();
        signInWithWrongCredential.clickOnSignInButton();
        Thread.sleep(5000);
        signInWithWrongCredential.errorMsg();
        Thread.sleep(5000);
        signInWithWrongCredential.clickOnForgotPassword();
        Thread.sleep(2000);
        setNewInfo.userName();
        setNewInfo.email();
        setNewInfo.phoneNumber();
        setNewInfo.clickOnResetLogInButton();
        Thread.sleep(3000);
        setNewInfo.clickOnGotoLogInButton();
        Thread.sleep(3000);
        signInWithActualCredential.inputUsername();
        signInWithActualCredential.inputPassword();
        Thread.sleep(2000);
        signInWithActualCredential.clickOnCheckBox();
        Thread.sleep(2000);
        signInWithActualCredential.clickOnSignInButton();
        Thread.sleep(3000);
        signInWithActualCredential.clickOnLogoutButton();
        Thread.sleep(2000);
        System.out.println("End");

    }
}

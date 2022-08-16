package driverPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseDriver {
    public static WebDriver driver  = null;

    @BeforeSuite
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}

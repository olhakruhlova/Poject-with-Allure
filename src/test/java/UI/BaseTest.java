package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;


    @BeforeMethod
    public void setUp() {
        System.setProperty("selenium.chrome.driver", "chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
         }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }
}

package UI.theInternet.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.TheInternetLoginPage;

public class TheInternetLoginPageSteps {
    private WebDriver driver;
    private TheInternetLoginPage theInternetLoginPage;

    public TheInternetLoginPageSteps(WebDriver driver) {
        this.driver = driver;
        theInternetLoginPage = new TheInternetLoginPage(driver);
    }

    @Step
    public void navigate() {
        theInternetLoginPage.navigate();
    }

    @Step
    public void login(testData.User user) {
        theInternetLoginPage.login(user);
    }

    @Step
    public void assertErrorMessage(String errorMessage) {
        Assert.assertEquals(theInternetLoginPage.getErrorMessage(), errorMessage);
    }
}

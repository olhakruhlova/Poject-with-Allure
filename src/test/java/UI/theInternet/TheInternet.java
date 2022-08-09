package UI.theInternet;

import UI.BaseTest;
import UI.theInternet.steps.TheInternetLoginPageSteps;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.Test;
import testData.User;

public class TheInternet extends BaseTest {


    // valid login: tomsmith
    // valid password: SuperSecretPassword!

    @Test(description = "Error message should appears if user enter invalid credentials",
            dataProvider = "userCredentialsDataProvider", dataProviderClass = DataProviders.class)

    public void errorMessageShouldAppears(String login, String password, String errorMessage) {

        //SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

        User user = new User(login, password);
        TheInternetLoginPageSteps theInternetLoginPageSteps = new TheInternetLoginPageSteps(driver);

        theInternetLoginPageSteps.navigate();
        theInternetLoginPageSteps.login(user);
        theInternetLoginPageSteps.assertErrorMessage(errorMessage);
 }
}

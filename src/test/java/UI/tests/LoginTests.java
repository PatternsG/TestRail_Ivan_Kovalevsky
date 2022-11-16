package UI.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest{

    @Test
    public void loginPositiveTest(){
        loginPage.waitForPageLoaded();
        loginPage.initialization(LOGIN, PASSWORD);
        loginPage.clickLoginButton();
        dashboardPage.waitForPageLoaded();
        Assert.assertTrue(dashboardPage.isDisplayed());
    }
}

package UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    private final static By LOGIN = By.id("name");
    private final static By PASSWORD = By.id("password");
    private final static By LOGIN_BUTTON = By.id("button_primary");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementOfDisplayed(LOGIN_BUTTON);
    }

    public void initialization(String login, String password){
        driver.findElement(LOGIN).sendKeys(login);
        driver.findElement(PASSWORD).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }
}

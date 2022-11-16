package UI.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{

    public static final By PAGE_LOCATOR = By.cssSelector(".content-header-title.page_title");
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementOfDisplayed(PAGE_LOCATOR);
    }

    public boolean isDisplayed(){
        return driver.findElement(PAGE_LOCATOR).isDisplayed();
    }

}

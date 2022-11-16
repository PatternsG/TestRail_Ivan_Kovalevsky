package UI.tests;

import UI.pages.DashboardPage;
import UI.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected String LOGIN = "kovalevskiiivan@gmail.com";
    protected String PASSWORD = "v6NfOepvh3wk6KWy7M4z";
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @BeforeMethod
    public void navigate(){
        driver.get("https://kovalevski.testrail.io/index.php?/auth/login/LWZhMDA0NWExYzgyM" +
                "2UyNWUzMDVjMjE3ZmRjNzU1ZWEzMjJkOTZmNWY1MWEwODk0MDNjZDJhN2E1NTQ2YTEzM2Y:");
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}

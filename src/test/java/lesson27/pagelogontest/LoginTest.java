package lesson27.pagelogontest;

import org.hillel.homework.lesson26.WebDriverFactory;
import org.hillel.homework.lesson27.flow.LoginFlow;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

import static org.hillel.homework.lesson27.utils.PopHelpers.closeCountryPopUpButton;

public class LoginTest {

    private static WebDriver driver;
    private static LoginFlow loginFlow;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getDriver("chrome");
        loginFlow = new LoginFlow (driver);
    }

    @BeforeEach
    public void openPage() {
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=27652&langId=-101&storeId=43152");
        driver.manage().window().maximize();
        closeCountryPopUpButton(driver);
    }

    @Test
    public void textErrorPasswordText() throws InterruptedException {
        loginFlow.setEmailAddressField("test@gmail.com");
        loginFlow.clickSubmitButton();
        Thread.sleep(3000);
        Assertions.assertTrue(loginFlow.isPasswordErrorDisplayed());
        Assertions.assertEquals(loginFlow.getPasswordErrorText(), "Please enter password.");
    }

    @Test
    public void textErrorLoginText() throws InterruptedException {
        loginFlow.setEmailAddressField("dfdfdfdg");
        loginFlow.clickSubmitButton();
        Thread.sleep(3000);
        Assertions.assertTrue(loginFlow.isEmailErrorDisplayed());
        Assertions.assertEquals(loginFlow.getLoginErrorText(), "Please enter a valid E-mail address.");
    }

    @AfterEach
    public void clean(){
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    public static void quitDriver() {
        driver.quit();
    }
}

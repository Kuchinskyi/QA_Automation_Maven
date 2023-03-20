package lesson26;

import org.hillel.homework.lesson26.WebDriverCash;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebDriverTest {
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverCash.getDriver("chrome");
    }

    @BeforeEach
    public void init2() {
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Store locator")
    public void testStoreLocator() {
        driver.navigate().to("https://www.ray-ban.com/row/c/store-locator");
        WebElement storeLocator = driver.findElement(By.xpath(
                "//input[@id='rb-store-locator-autocomplete']"));
        storeLocator.sendKeys("Kyiv");
        Assertions.assertTrue(storeLocator.isDisplayed());
    }

    @Test
    @DisplayName("Audio on/off")
    public void audioOnOff() {
        driver.navigate().to("https://www.ray-ban.com/row");
        WebElement storeLocator = driver.findElement(By.xpath(
                "//button[@data-element-id='X_Pdp_Video_Audio']"));
        storeLocator.click();
        storeLocator.click();
        Assertions.assertTrue(storeLocator.isDisplayed());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}

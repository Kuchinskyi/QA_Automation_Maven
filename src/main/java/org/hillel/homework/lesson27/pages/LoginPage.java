package org.hillel.homework.lesson27.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends AbstractPage {


    private static final By EMAIL_ADDRESS_FIELD = By.id("loginEmail");
    private static final By PASSWORD_FIELD = By.id("wcs_logon_password");
    private static final By SUBMIT_BUTTON = By.id("login_submit");
    private static final By PASSWORD_ERROR = By.xpath("//div[@class='password-field rb-fieldrow rb-fieldrow--required rb-invalidrow']/span");
    private static final By EMAIL_ERROR = By.xpath("//div[@class='rb-fieldrow rb-fieldrow--required rb-invalidrow']/span");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return driver.findElement(EMAIL_ADDRESS_FIELD);
    }

    public WebElement getPasswordField() {
        return driver.findElement(PASSWORD_FIELD);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(SUBMIT_BUTTON);
    }

    public WebElement getPasswordError() {
        return driver.findElement(PASSWORD_ERROR);
    }

    public WebElement getLoginError() {
        return driver.findElement(EMAIL_ERROR);
    }

}

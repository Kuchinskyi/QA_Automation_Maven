package org.hillel.homework.lesson27.flow;

import org.hillel.homework.lesson27.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setEmailAddressField(String emailAddressField) {
        loginPage.getEmailField().sendKeys(emailAddressField);
    }


    public void clickSubmitButton() {
        loginPage.getSubmitButton().click();
    }

    public void setPasswordField(String passwordAddress) {
        loginPage.getPasswordField().sendKeys(passwordAddress);
    }

    public String getPasswordErrorText() {
        return loginPage.getPasswordError().getText();
    }

    public String getLoginErrorText() {
        return loginPage.getLoginError().getText();
    }

    public boolean isPasswordErrorDisplayed() {
        return loginPage.getPasswordError().isDisplayed();
    }

    public boolean isEmailErrorDisplayed() {
        return loginPage.getLoginError().isDisplayed();
    }

    public void login(String email, String password){
        setEmailAddressField(email);
        setPasswordField(password);
        clickSubmitButton();
    }
}

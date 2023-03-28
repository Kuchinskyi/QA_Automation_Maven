package org.hillel.homework.lesson27.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PopHelpers {

    private static final By CLOSE_COUNTRY_POP_UP_BUTTON = By.xpath("//button[@class='rb-modal-close']");

    public PopHelpers() {
    }

    public static void closeCountryPopUpButton(WebDriver driver) {
        try {
            driver.findElement(CLOSE_COUNTRY_POP_UP_BUTTON).click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop up is non displayed");
        }
    }
}

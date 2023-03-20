package org.hillel.homework.lesson26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String driver) {
        switch (driver) {
            case "chrome":
                System.setProperty("webdriver.http.factory", "jdk-http-client");
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                return new ChromeDriver();
            case "adge":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                return new EdgeDriver();
            default:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                return new ChromeDriver();
        }
    }
}

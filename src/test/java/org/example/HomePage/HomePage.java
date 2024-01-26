package org.example.HomePage;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage extends DriverSetup {
    @Test
    public void OpenHome() throws InterruptedException {
        browser.get("https://www.thecitybank.com/home");
        Thread.sleep(2000);

        JavascriptExecutor js =(JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);

        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(3000);


    }
}

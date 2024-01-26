package org.example.HomePage;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomePage extends DriverSetup {


    @Test (priority = 0 )
    public  void GetStarted() throws InterruptedException {
        browser.get("https://www.thecitybank.com/home");
        Thread.sleep(1000);

        WebElement dropdown = browser.findElement(By.id("who"));
        Select select = new Select(dropdown);
        select.selectByValue("7");
        Thread.sleep(1000);
    }


    @Test (priority = 1 )
    public void CurrencyConverter() throws InterruptedException {
        browser.get("https://www.thecitybank.com/home");
        Thread.sleep(2000);

        browser.findElement(By.name("amount_usd")).sendKeys("11");
        Thread.sleep(2000);




    }
}

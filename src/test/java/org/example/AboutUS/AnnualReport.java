package org.example.AboutUS;

import org.example.DriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AnnualReport extends DriverSetup {


    @Test
    public void testScroll() throws InterruptedException {
        browser.get("https://www.citybankplc.com/report/annualreports");

        JavascriptExecutor js =(JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(3000);

        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(3000);

        WebElement elementToClick = browser.findElement(By.xpath("//div[@class='annual-cards items']//div[1]//div[1]//div[2]//a[1]"));
        elementToClick.click();
        Thread.sleep(5000);

    }
}

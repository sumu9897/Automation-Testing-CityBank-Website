package org.example.AboutUS;

import org.example.DriverSetup;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class OverView extends DriverSetup{

        @Test
        public void testScroll() throws InterruptedException {
            browser.get("https://www.citybankplc.com/who-we-are");

            JavascriptExecutor js =(JavascriptExecutor) browser;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(3000);

            js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
            Thread.sleep(3000);
        }
}

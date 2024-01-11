package org.example;

import org.testng.annotations.Test;

public class HomePage extends DriverSetup{
    @Test
    public void OpenHome() throws InterruptedException {
        browser.get("https://www.thecitybank.com/home");
        Thread.sleep(2000);
    }
}

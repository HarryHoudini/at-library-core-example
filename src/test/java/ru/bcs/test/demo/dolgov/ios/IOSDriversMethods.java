package ru.bcs.test.demo.dolgov.ios;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriversMethods {
    public AppiumDriver<WebElement> driver;
    public DesiredCapabilities cap;

    public void iOSLounchApp() throws MalformedURLException {
        cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
        cap.setCapability(MobileCapabilityType.APP, "ru.admitadteam.Cooking-eggs");
//        cap.setCapability("bundleId", "ru.admitadteam.Cooking-eggs");
        driver = new IOSDriver<WebElement>(new URL("http://test:test-password@selenoid.t-global.bcs:4444/wd/hub"), cap);
        Assert.assertNotNull(driver);

    }

    public void closeApp() {
        driver.quit();
    }

    public AppiumDriver<WebElement> getDriver() {
        return driver;
    }
}

package com.example.pagamentodecompras;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CompraTudo {

    private AndroidDriver driver;
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.example.pagamentodecompras");
        desiredCapabilities.setCapability("appActivity", "com.example.pagamentodecompras.MainActivity");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }
    @Test
    public void compraTudo() throws InterruptedException {
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.pgamentodecompras:id/cbarroz");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.pgamentodecompras:id/cbcarne");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.example.pgamentodecompras:id/Pão");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.example.pgamentodecompras:id/Leite");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.example.pgamentodecompras:id/Ovos");
        el5.click();
        Thread thread = new Thread();
        thread.sleep(5000);



    }
    @After
    public void tearDown(){
        driver.quit();
    }
}

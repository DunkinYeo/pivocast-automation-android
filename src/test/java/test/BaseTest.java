package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import utils.DesiredCaps;

import java.io.IOException;
import java.net.URL;

public class BaseTest {

    public AndroidDriver driver;
    private static AppiumDriverLocalService service;
    private final DesiredCaps desiredCaps = new DesiredCaps();


    @BeforeSuite
    public void globalSetup() throws IOException {
        System.out.println("Starting BeforeSuite...");

        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @BeforeMethod
    @Parameters({"deviceName", "platformVersion", "udid"})
    public void setUp(String deviceName, String platformVersion, @Optional("udid is optional") String udid) throws Exception {
        System.out.println("BeforeTest...");
        DesiredCapabilities caps = desiredCaps.getDesiredCapabilities(deviceName, platformVersion, udid);

        try {
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("AfterTest...");

        if (driver != null) {
            driver.quit();
        }
    }

    @AfterSuite
    public void globalTearDown () {
        System.out.println("AfterSuite...");

        if (service != null) {
            service.stop();
        }
    }
    public URL getServiceUrl () {
        return service.getUrl();
    }
}

package views;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseView {
    protected AndroidDriver<AndroidElement> driver;
    protected WebDriverWait wait;

    public BaseView(AndroidDriver androidDriver){
        this.driver = androidDriver;
        this.wait = new WebDriverWait(this.driver, 60, 1000);
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public void waitForVisibility(AndroidElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitAndClick(AndroidElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void clear(AndroidElement element) {
        waitForVisibility(element);
        element.clear();
    }

    public void click(AndroidElement element) {
        waitForVisibility(element);
        element.click();
    }

    public void sendText(AndroidElement element, String text) {
        waitForVisibility(element);
        element.sendKeys(text);
    }

    public String getAttribute(AndroidElement element, String attribute) {
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }


    public void scrollToId(AndroidDriver driver, String id) {
        AndroidElement el = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().resourceIdMatches(\"" + id + "\"));"));
    }

    public static void scrollToText(AndroidDriver driver, String text) {
        AndroidElement el = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiSelector().scrollable(ture)).scrollIntoView("
                        + " new UiSelector().text(\"" + text + "\");"));
    }


}

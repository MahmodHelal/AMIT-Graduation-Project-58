package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ABTest {
    WebDriver driver;
    String expectedHeader = "A/B Test Control";

    By abTestHeader = By.tagName("h3");

    public ABTest(WebDriver driver) {
        this.driver = driver;
    }

    public String getABTestHeader() {
        return driver.findElement(abTestHeader).getText();
    }
    public String getExpectedHeader() {
        return expectedHeader;
    }

}

package Pages.FormAuthPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
    WebDriver driver;
    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }


    By successMessageLocator = By.id("flash");
    String expectedSuccessMsg = "You logged into a secure area!";
    By logoutButtonLocator = By.xpath("//a[@href='/logout']");



    public String getActualMessage() {
         return driver.findElement(successMessageLocator).getText();

    }
    public String getExpectedSuccessMsg(){
        return expectedSuccessMsg;
    }
}

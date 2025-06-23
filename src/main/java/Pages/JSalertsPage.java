package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSalertsPage {
    WebDriver driver;

    private By jsAlertButton = By.xpath("//button[@onclick='jsAlert()']");
    private By jsConfirmButton =By.cssSelector("button[onclick='jsConfirm()']");
    private By jsPromptButton = By.xpath("//button[contains(text(),'Click for JS Prompt')]");
    private By resultText = By.id("result");
    private String expectedMessageForClickAlert = "You successfully clicked an alert";
    private String expectedMessageForinputPopup = "You entered: Helal";

    public JSalertsPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnAlertButton(){
        driver.findElement(jsAlertButton).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void sendDataIntoPromptAlert(String input){
        driver.findElement(jsPromptButton).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(input);
        alert.accept();
    }

    public String getActualResultMessage(){
        return driver.findElement(resultText).getText();
    }

    public String getExpectedMessageForClickAlert(){
        return expectedMessageForClickAlert;
    }
    public String getExpectedMessageForPromptAlert(){
        return expectedMessageForinputPopup;
    }

}

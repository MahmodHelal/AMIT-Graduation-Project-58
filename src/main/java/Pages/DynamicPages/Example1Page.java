package Pages.DynamicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Example1Page {
    WebDriver driver;

    WebDriverWait wait ;



    private By startButton = By.xpath("//button[contains(text(),'Start')]");
    private By resultText = By.xpath("//div[@id='finish']//h4");
    private String expectedText = "Hello World!";


    public Example1Page(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
    }
    public String getresultText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultText)).getText();
//        return driver.findElement(resultText).getText();
    }
    public String getExpectedText(){
        return expectedText;
    }
}

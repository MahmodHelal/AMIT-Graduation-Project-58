package Pages.DynamicPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadigPage {
    WebDriver driver;

    private By example1Link = By.partialLinkText("Element on page that is hidden");

    public DynamicLoadigPage(WebDriver driver) {
        this.driver = driver;
    }

    public Example1Page goToExample1Page(){
        driver.findElement(example1Link).click();
        return new Example1Page(driver);
    }




}

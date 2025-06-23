package Pages;

import Pages.DynamicPages.DynamicLoadigPage;
import Pages.FormAuthPages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private final By authFormLink = By.linkText("Form Authentication");
    private final By abTestLink = By.linkText("A/B Testing");
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");
    private By alertsLink = By.linkText("JavaScript Alerts");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage goToLoginPage() {
        driver.findElement(authFormLink).click();
        return new LoginPage(driver);
    }

    public ABTest goToABTestPage() {
        driver.findElement(abTestLink).click();
        return new ABTest(driver);
    }

    public DynamicLoadigPage goToDynamicLoadingPage(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadigPage(driver);

    }

    public JSalertsPage goToJsAlertsPage(){
        driver.findElement(alertsLink).click();
        return new JSalertsPage(driver);
    }



}

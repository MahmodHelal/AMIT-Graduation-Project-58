package Pages.FormAuthPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
  WebDriver driver;
  public LoginPage(WebDriver driver){
      this.driver = driver;
  }
  By usernameField = By.id("username");
  By passwordField = By.id("password");
  By loginButton = By.className("radius");
    By FailMessageLocator = By.id("flash");
    String expectedFailMsgforUserName = "Your username is invalid!";
    String expectedFailMsgforPassword = "Your password is invalid!";


    public WelcomePage login(String username, String password)  {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new WelcomePage(driver);
    }
    public String getActualMessage() {
        return driver.findElement(FailMessageLocator).getText();

    }
    public String getExpectedFailMsgforUserName() {
        return expectedFailMsgforUserName;
    }
    public String getExpectedFailMsgforPassword() {
        return expectedFailMsgforPassword;
    }
    public WebElement getErrorMessage(){
        return driver.findElement(FailMessageLocator);
    }

}

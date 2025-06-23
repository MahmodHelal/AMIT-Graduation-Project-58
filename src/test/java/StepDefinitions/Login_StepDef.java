package StepDefinitions;

import Pages.FormAuthPages.LoginPage;
import Pages.FormAuthPages.WelcomePage;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login_StepDef {


    WebDriver driver = Hooks.getDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage;
    WelcomePage welcomePage;

    @Given("User is on the login page")
    public void user_is_on_the_login_page(){
        loginPage=homePage.goToLoginPage();
        String titleOFPage = driver.getTitle();
//        System.out.println("Title of the page is: " + titleOFPage);
        Assert.assertEquals(titleOFPage, "The Internet", "Title does not match");

    }

    @Then("User should be redirected to the dashboard page")
    public void userShouldBeRedirectedToTheDashboardPage() {
        Assert.assertTrue(welcomePage.getActualMessage().contains(welcomePage.getExpectedSuccessMsg()), "Success message does not match");
    }



    @When("User enters valid {string} and {string}")
    public void userEntersValidAnd(String userName, String password) {
        welcomePage = loginPage.login(userName, password);

    }

    @Then("User should see an error message indicating invalid password")
    public void userShouldSeeAnErrorMessageIndicatingInvalidPassword() {
        Assert.assertTrue(loginPage.getActualMessage().contains(loginPage.getExpectedFailMsgforPassword()));
    }

    @Then("User should see an error message indicating invalid username")
    public void userShouldSeeAnErrorMessageIndicatingInvalidUsername() {
        Assert.assertTrue(loginPage.getActualMessage().contains(loginPage.getExpectedFailMsgforUserName()));
    }

    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        Assert.assertTrue(loginPage.getErrorMessage().isDisplayed());

    }
}

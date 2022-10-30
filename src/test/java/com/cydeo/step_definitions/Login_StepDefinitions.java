package com.cydeo.step_definitions;

import com.cydeo.pages.ActivityStreamPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }
    @When("user enters HR username {string}")
    public void user_enters_HR_username(String string) {
        loginPage.inputUsername.sendKeys(string);
    }
    @When("user enters HR password {string}")
    public void user_enters_HR_password(String string) {
        loginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks the Log In Button")
    public void user_clicks_the_log_in_button() {
        loginPage.loginButton.click();
    }
    @Then("user should see the Activity Stream page")
    public void user_should_see_the_activity_stream_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activityStreamPage.activityStreamPageTitle));
        String actualTitle = Driver.getDriver().getTitle();
        //String actualPageTitle = activityStreamPage.activityStreamPageTitle.getText();
        //Assert.assertTrue(actualPageTitle.equals("Activity Stream"));
        Assert.assertTrue(actualTitle.contains("Portal"));
        Driver.closeDriver();
    }

    @When("user enters helpdesk username {string}")
    public void user_enters_helpdesk_username(String string) {
        loginPage.inputUsername.sendKeys(string);
    }
    @When("user enters helpdesk password {string}")
    public void user_enters_helpdesk_password(String string) {
        loginPage.inputPassword.sendKeys(string);
    }

    @When("user enters marketing username {string}")
    public void user_enters_marketing_username(String string) {
        loginPage.inputUsername.sendKeys(string);
    }
    @When("user enters marketing password {string}")
    public void user_enters_marketing_password(String string) {
        loginPage.inputPassword.sendKeys(string);
    }

    @When("user enters invalid username  {string}")
    public void user_enters_invalid_username(String string) {
        loginPage.inputUsername.sendKeys(string);
    }
    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String string) {
        loginPage.inputPassword.sendKeys(string);
    }
    @Then("user should not see the Activity Stream page")
    public void user_should_not_see_the_activity_stream_page() {
        String loginPageTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Authorization";
        Assert.assertTrue(expectedTitle.equals(loginPageTitle));
        Driver.closeDriver();
    }





}

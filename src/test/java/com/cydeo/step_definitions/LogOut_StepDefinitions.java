package com.cydeo.step_definitions;

import com.cydeo.pages.ActivityStreamPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOut_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.inputUsername.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.inputPassword.sendKeys(string);
    }
    @When("user clicks the Login Button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }
    @When("user sees Activity Stream page")
    public void user_sees_activity_stream_page() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(activityStreamPage.activityStreamPageTitle));
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Portal"));
    }
    @When("user clicks the Log out button")
    public void user_clicks_the_log_out_button() {
        activityStreamPage.userBlockMenu.click();
        activityStreamPage.logOutButton.click();
    }
    @Then("user sees Login page")
    public void user_sees_login_page() {
        String loginPageTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Authorization";
        Assert.assertEquals(expectedTitle, loginPageTitle);
    }

    @When("user clicks step back button")
    public void user_clicks_step_back_button() {
        Driver.getDriver().navigate().back();
    }
    @Then("user does not see Activity Stream page")
    public void user_does_not_see_activity_stream_page() {
        String loginPageTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Authorization";
        Assert.assertEquals(expectedTitle, loginPageTitle);
        Driver.closeDriver();
    }


    @When("user closes all open browsers")
    public void user_closes_all_open_browsers() {
        Driver.closeDriver();
    }
}

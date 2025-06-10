package stepdefinition;

import base.InitDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import pages.MainPage;

public class LoginStep {

    MainPage mainPage;
    LoginPage loginPage;

    @Given("user opens the demo web shop page")
    public void user_opens_the_demo_web_shop_page() {
        InitDriver.getDriver().get("https://demowebshop.tricentis.com/");
        mainPage=new MainPage(InitDriver.getDriver());
         loginPage=new LoginPage(InitDriver.getDriver());
    }

    @When("user click on the login button on the top menu")
    public void user_click_on_the_login_button_on_the_top_menu() {
        mainPage.loginPageBtnClick();
    }

    @When("user enters the username {string}")
    public void user_enters_the_username(String username) {
        loginPage.enterUserName(username);
    }

    @When("user enters the password {string}")
    public void user_enters_the_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.submitLogin();
    }

    @Then("user should be successfully logged in")
    public void user_should_be_successfully_logged_in() {
        Assert.assertNotNull( mainPage.getLogAccountName());
        System.out.println(mainPage.getLogAccountName());
    }

}

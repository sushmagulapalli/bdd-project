package org.learning.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.learning.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user launches the browser")
    public void user_launches_the_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("user opens URL \\\"([^\\\"]*)\\\"")
    public void user_opens_URL(String url) {
        driver.get(url);
        loginPage = new LoginPage(driver);
    }

    @When("user enters email as \\\"([^\\\"]*)\\\" and password as \\\"([^\\\"]*)\\\"")
    public void user_enters_email_as_and_password_as(String userName, String password) {
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
    }

    @When("clicks on login")
    public void clicks_on_login() {
        loginPage.clickLogin();
    }

    @Then("the page title should be \\\"([^\\\"]*)\\\"")
    public void the_page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @Then("close the browser")
    public void close_the_browser() {
        driver.close();
    }

}

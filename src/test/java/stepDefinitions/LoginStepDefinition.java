package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginStepDefinition {

    @Given("User launches SauceDemo website")
    public void launchWebsite(){

        Hooks.driver.get("https://www.saucedemo.com");

    }

    @When("^User logs in with username \"(.+)\" and password \"(.+)\"$")
    public void login(String username, String password){

        Hooks.driver.findElement(By.id("user-name"))
                .sendKeys(username);

        Hooks.driver.findElement(By.id("password"))
                .sendKeys(password);

        Hooks.driver.findElement(By.id("login-button"))
                .click();

    }

    @Then("Products page should display")
    public void productsPage(){

        String title = Hooks.driver.findElement(By.className("title"))
                .getText();

        Assert.assertEquals(title,"Products");

    }
}
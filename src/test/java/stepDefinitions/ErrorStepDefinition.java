package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ErrorStepDefinition {

    @Then("Error message should display")
    public void errorMessage(){

        String error = Hooks.driver.findElement(By.tagName("h3"))
                .getText();

        Assert.assertTrue(error.contains("Username and password"));

    }
}
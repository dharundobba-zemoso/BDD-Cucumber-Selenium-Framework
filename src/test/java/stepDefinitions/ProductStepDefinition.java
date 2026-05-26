package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductStepDefinition {

    @When("^User adds \"(.+)\" to cart$")
    public void addProduct(String product){

        Hooks.driver.findElement(
                        By.xpath("//div[text()='"+product+"']/ancestor::div[@class='inventory_item']//button"))
                .click();

    }

    @Then("^Cart badge should display \"(.+)\"$")
    public void cartBadge(String count){

        String badge = Hooks.driver.findElement(By.className("shopping_cart_badge"))
                .getText();

        Assert.assertEquals(badge,count);

    }
}
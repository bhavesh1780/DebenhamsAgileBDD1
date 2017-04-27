package DebenhamsAgileBDD;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by Dell on 27/04/2017.
 */
public class MyStepdefs extends BasePage{

    HomePage homePage = new HomePage();
    BasketPage basketPage = new BasketPage();
    ToyPage toyPage = new ToyPage();


    @Given("^User is on Debenhams home page$")
    public void userIsOnDebenhamsHomePage()  {
        homePage.userIsOnHomePage();
        //System.out.println(driver.findElement(By.id("headerLogin")).getText());
        Assert.assertTrue(driver.findElement(By.id("headerLogin")).getText().contains("Create Account/Sign In"));

    }

    @When("^Add any toy to a basket$")
    public void Add_any_toy_to_a_basket() {
        toyPage.userShouldAbleToAddToyToBasket();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='mainHeader']/div[4]/button")).getText().contains("My Bag"));


    }

    @Then("^He should able to see product into a basket$")
    public void He_should_able_to_see_product_into_a_basket() {
        basketPage.verifyProductHasBeenAddedToBasket();

    }

    @When("^He remove product from basket$")
    public void He_remove_product_from_basket() {
        basketPage.userShouldAbleToRemoveProductFromBasketSuccessfully();

    }

    @Then("^He should able to see that product has been successfully removed from basket$")
    public void He_should_able_to_see_that_product_has_been_successfully_removed_from_basket() throws InterruptedException {
       // Assert.assertTrue(driver.findElement(By.xpath("//div[@id='cfs_body920']/div/span")).getText().contains("Your shopping bag is empty."));
         Thread.sleep(3000);
         basketPage.verifyProductHasBeenRemovedFromBasket();
    }

    @When("^User search for any toy$")
    public void userSearchForAnyToy()  {
        homePage.searchForAnyToy();
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(@class,'breadcrumb current')]")).getText().contains("bright starts in Toys"));
    }
}

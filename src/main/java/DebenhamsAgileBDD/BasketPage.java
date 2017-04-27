package DebenhamsAgileBDD;

import org.openqa.selenium.By;
import org.testng.Assert;


/**
 * Created by Dell on 27/04/2017.
 */
public class BasketPage extends Utils {



    public void verifyProductHasBeenAddedToBasket(){
        //Click on MyBag
        clickOnElement(By.xpath("//div[@id='mainHeader']/div[4]/button"));
        //verify that there is 1 product is in the bag
        Assert.assertEquals(driver.findElement(By.xpath("//span[contains(@class,'main-mini-bag-total')]")).getText(),"(1)");

    }

    public void userShouldAbleToRemoveProductFromBasketSuccessfully(){
        //click on MyBag
        clickOnElement(By.xpath("//div[@id='mainHeader']/div[4]/button"));
        //click on remove button on shopping cart
        clickOnElement(By.id("WC_OrderItemDetailsf_links_2_"));
        //click on remove it
        clickOnElement(By.id("removeFromBasket"));

    }

    public void verifyProductHasBeenRemovedFromBasket(){
        //WebDriverWait wait = new WebDriverWait(driver, 15);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='empty-bag-content']/span")));
        //verify that there is no product in my bag
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='empty-bag-content']/span")).getText(),"Your shopping bag is empty.");
        System.out.println("hello");
    }
}

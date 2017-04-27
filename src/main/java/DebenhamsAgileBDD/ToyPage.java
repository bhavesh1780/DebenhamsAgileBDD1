package DebenhamsAgileBDD;

import org.openqa.selenium.By;

/**
 * Created by Dell on 27/04/2017.
 */
public class ToyPage extends Utils {

    public void userShouldAbleToAddToyToBasket(){
        //click on "Bright Starts Safari beat musical toy"
        clickOnElement(By.xpath("//div[@id='gird_view']/table/tbody/tr[2]/td[2]/div/div/div[3]/a"));
        //System.out.println(driver.findElement(By.xpath("//div[@id='gird_view']/table/tbody/tr[2]/td[2]/div/div/div[3]/a")).getText());
        //Bright Starts Safari beat musical toy
        //Click on Add to basket
        clickOnElement(By.id("productPageAdd2Cart"));

    }
}

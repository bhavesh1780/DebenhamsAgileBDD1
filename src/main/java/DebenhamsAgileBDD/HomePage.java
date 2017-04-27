package DebenhamsAgileBDD;

import org.openqa.selenium.By;

/**
 * Created by Dell on 27/04/2017.
 */
public class HomePage extends Utils {

    public void userIsOnHomePage(){
        driver.get("http://www.debenhams.com/");
    }

  public void searchForAnyToy(){
        typeText(By.id("searchSuggestControlDesktop"),"bright starts in Toys");
        clickOnElement(By.name("searchBtn"));
  }
}

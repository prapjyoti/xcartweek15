package com.xcart.mobile.testsuit;

import com.xcart.mobile.pages.HomePage;
import com.xcart.mobile.pages.TopMenuPage;
import com.xcart.mobile.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    TopMenuPage topMenuPage = new TopMenuPage();

    @Test(groups = {"smoke","sanity","regression"})
    public void verifyUserShouldNavigateToShippingPageSuccessfully() throws InterruptedException {
     homePage.clickOnShippingLink();
        Thread.sleep(1000);
        String expectedMessage = "Shipping";
        String actualMessage = topMenuPage.verifyShippingPageNavigation();
        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
      homePage.clickOnNewLink();
        String expectedMessage = "New arrivals";
        String actualMessage = topMenuPage.verifyNewPageNavigation();
        Assert.assertEquals(actualMessage,expectedMessage);


    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully(){

    homePage.clickComingSoonLink();
        String expectedMessage = "Coming soon";
        String actualMessage = topMenuPage.verifyComingSoonPageNavigation();
        Assert.assertEquals(actualMessage,expectedMessage);


    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickContactUsLink();
        String expectedMessage = "Contact us";
        String actualMessage = topMenuPage.verifyContactUsPageNavigation();
        Assert.assertEquals(actualMessage,expectedMessage);


    }

}

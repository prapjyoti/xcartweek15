package com.xcart.mobile.testng;

import org.testng.annotations.Test;

public class TestNGGrouping {

    @Test(groups = {"smoke", "sanity", "regression"})
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {

    }

    @Test(groups = {"sanity,regression"})
    public void verifyUserShouldNavigateToNewPageSuccessfully() {

    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToComingSoonPageSuccessfully() {

    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToContactUsPageSuccessfully() {

    }

    @Test(groups = {"smoke,sanity,regression"})
    public void verifySaleProductArrangeAlphabetically() {

    }

    @Test(groups = {"sanity", "regression"})
    public void verifySaleProductsPriceArrangeLowToHigh() {

    }

    @Test(groups = "regression")
    public void verifySaleProductsArrangeByRates() {

    }

    @Test(groups = "regression")
    public void verifyBestSellersProductsArrangeByZToA() {

    }

    @Test(groups = "regression")
    public void verifyBestSellersProductsPriceArrangeHighToLow() {

    }

    @Test(groups = {"smoke,sanity,regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersProduct() {

    }

    @Test(groups = {"sanity,regression"})
    public void verifyThatUserShouldClearShoppingCartSuccessfully() {

    }
}

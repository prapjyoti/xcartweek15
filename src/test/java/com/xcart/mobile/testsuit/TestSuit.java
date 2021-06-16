package com.xcart.mobile.testsuit;

import com.xcart.mobile.pages.*;
import com.xcart.mobile.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuit extends TestBase {

    // private static String email = "kelly" + Utility.generateRandomNumber() + "yahoo.com";
    HotDealsPage hotDealsPage = new HotDealsPage();
    BestSellersPage bestSellersPage = new BestSellersPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    CheckOutProductPage checkOutProductPage = new CheckOutProductPage();
    ClearShoppingCart clearShoppingCart = new ClearShoppingCart();

    @Test(groups = {"smoke,sanity,regression"})
    public void verifySaleProductArrangeAlphabetically() throws InterruptedException {

        hotDealsPage.mouseHoverOnHotdeals();
        Thread.sleep(1000);
        hotDealsPage.mouseHoverOnSaleAndClick();
        Thread.sleep(1000);
        String expectedMessage = "Sale";
        String actualMessage = hotDealsPage.verifyTheTextSale();
        Assert.assertEquals(actualMessage, expectedMessage);

        Thread.sleep(500);
        hotDealsPage.mouseHoverSortByProduct();
        Thread.sleep(1000);
        hotDealsPage.selectProductAtoZ("Name A-Z");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.arrangeTheProductAlphabetically();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);

    }

    @Test(groups = {"sanity","regression"})
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotdeals();
        Thread.sleep(1000);
        hotDealsPage.mouseHoverOnSaleAndClick();
        Thread.sleep(1000);
        String expectedMessage = "Sale";
        String actualMessage = hotDealsPage.verifyTheTextSale();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(500);
        hotDealsPage.mouseHoverSortByProduct();
        Thread.sleep(1000);
        hotDealsPage.selectProductLowToHighPosition("Price Low-High");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.arrangeTheProductLowToHigh();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);


    }

    @Test(groups = "regression")
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotdeals();
        Thread.sleep(1000);
        hotDealsPage.mouseHoverOnSaleAndClick();
        Thread.sleep(1000);
        String expectedMessage = "Sale";
        String actualMessage = hotDealsPage.verifyTheTextSale();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(500);
        hotDealsPage.mouseHoverSortByProduct();
        Thread.sleep(1000);
        hotDealsPage.selectRatesPositionFromMenu("Rates");
        Thread.sleep(1000);
        List<WebElement> products;
        products = hotDealsPage.arrangeTheProductOnRates();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList);
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);


    }

    @Test(groups = "regression")
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {

        hotDealsPage.mouseHoverOnHotdeals();
        bestSellersPage.mouseHoverClickOnBestSellerLink();
        Thread.sleep(1000);
        String expectedMessage = "Bestsellers";
        String actualMessage = bestSellersPage.verifyBestsellersTextPage();
        Assert.assertEquals(actualMessage, expectedMessage);
        bestSellersPage.sortByMouseHoverProduct();
        bestSellersPage.selectPositionAToAFromDropdown("Name Z-A");
        Thread.sleep(1000);
        List<WebElement> products;
        products = bestSellersPage.arrangeProductNameZToA();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList, Collections.<String>reverseOrder());
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);


    }
    //This is fail method for screen shot
    @Test(groups = "regression")
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotdeals();
        Thread.sleep(1000);
        bestSellersPage.mouseHoverClickOnBestSellerLink();
        Thread.sleep(1000);
        String expectedMessage = "Bestsellers";
        String actualMessage = bestSellersPage.verifyBestsellersTextPage();
        Assert.assertEquals(actualMessage, expectedMessage);
        bestSellersPage.sortByMouseHoverProduct();
        bestSellersPage.selectPositionPriceHigToLow("Price High-Low");
        Thread.sleep(2000);
        List<WebElement> products;
        products = bestSellersPage.arrangeProductHighToLow();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList, Collections.<String>reverseOrder());
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);


    }

    @Test(groups = {"regression"})
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotdeals();
        bestSellersPage.mouseHoverClickOnBestSellerLink();
        Thread.sleep(1000);
        String expectedMessage = "Bestsellers";
        Thread.sleep(1000);
        String actualMessage = bestSellersPage.verifyBestsellersTextPage();
        Assert.assertEquals(actualMessage, expectedMessage);
        bestSellersPage.sortByMouseHoverProduct();
        bestSellersPage.selectPostionOnRates("Rates");
        Thread.sleep(2000);
        List<WebElement> products;
        products = bestSellersPage.arrangeProductOnRatesBasis();
        List<String> productslist = new ArrayList<>();
        for (WebElement productname : products) {
            productslist.add(productname.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productslist);
        Collections.sort(tempList, Collections.<String>reverseOrder());
        System.out.println(productslist);
        System.out.println(tempList);
        Assert.assertEquals(productslist, tempList);

    }

    @Test(groups = {"smoke,sanity,regression"})
    public void verifyThatUserShouldPlaceOrderSuccessfullyForAvengersProduct() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotdeals();
        Thread.sleep(500);
        hotDealsPage.mouseHoverOnSaleAndClick();
        //Thread.sleep(1000);
        String expectedMessage = "Sale";
        Thread.sleep(1000);
        String actualMessage = hotDealsPage.verifyTheTextSale();
        Assert.assertEquals(actualMessage, expectedMessage);

        Thread.sleep(500);
        hotDealsPage.mouseHoverSortByProduct();
        Thread.sleep(1000);
        hotDealsPage.selectProductAtoZ("Name A-Z");
        Thread.sleep(500);
        shoppingPage.mouseHoverOnAvengersProduct();
        Thread.sleep(500);
        shoppingPage.clickOnAddToCartProductAvengers();
        Thread.sleep(1000);
        String expectedCartText = "Product has been added to your cart";
        String actualCartTest = shoppingPage.verifySelectedProductAddedToCartSuccessfully();
        Assert.assertEquals(actualCartTest, expectedCartText);
        Thread.sleep(500);
        shoppingPage.clickOnXSignToCloseTheMessage();
        Thread.sleep(500);
        shoppingPage.clickOnYourCartIcon();
        shoppingPage.clickOnViewCartProduct();
        Thread.sleep(1000);
        String expectedShoppingCart = "Your shopping cart - 1 item";
        String actualShoppingCart = shoppingPage.verifyShoppingCartOneItem();
        Assert.assertEquals(actualShoppingCart, expectedShoppingCart);
        Thread.sleep(500);
        shoppingPage.clearTheQtyOne();
        Thread.sleep(500);
        shoppingPage.changeTheQty();
        Thread.sleep(1000);
        String expectedUpdateCart = "Your shopping cart - 2 items";
        String actualUpdateCart = shoppingPage.verifyYourShoppingCartUpdatedTwoItem();
        Assert.assertEquals(actualUpdateCart, expectedUpdateCart);
        Thread.sleep(1000);
        String expectedSubTotal = "$29.98";
        String actualsubTotal = shoppingPage.verifySubTotalPrice();
        Assert.assertEquals(actualsubTotal, expectedSubTotal);
        Thread.sleep(1000);
        String expectedTotal = "$36.00";
        String actualTotal = shoppingPage.verifyTotalPrice();
        Assert.assertEquals(actualTotal, expectedTotal);
        Thread.sleep(1000);
        shoppingPage.clickOnGoToCheckoutButton();
        Thread.sleep(1000);
        String expectedlogintoaccount = "Log in to your account";
        String actuallogintoaccount = checkOutProductPage.verifyTheTextLoginToYourAccount();
        Assert.assertEquals(actuallogintoaccount, expectedlogintoaccount);
        checkOutProductPage.enterEmailId("linda.brown" + randomInt + "@outlook.com");
        checkOutProductPage.clickOnContinueButton();
        Thread.sleep(1000);
        String expectedsecurecheckout = "Secure Checkout";
        String actualsecurecheckout = checkOutProductPage.verifyTheTextSecureCheckout();
        Assert.assertEquals(actualsecurecheckout, expectedsecurecheckout);
        Thread.sleep(1000);
        checkOutProductPage.enterTheFirstNameField("Linda");
        checkOutProductPage.enterTheListNameField("Brown");
        checkOutProductPage.enterAddressField("47 Burnside cresent");
        checkOutProductPage.clearCityName();
        checkOutProductPage.enterCityNameField("London");
        Thread.sleep(1000);
        checkOutProductPage.selectCountryCodeField(6);
        //Thread.sleep(1000);
        checkOutProductPage.selectCountyCodeForShipping("Middlesex");
        checkOutProductPage.clearZipcodeField();
        Thread.sleep(1000);
        checkOutProductPage.enterZipCodeDetails("HA0 1BJ");
        checkOutProductPage.checkBoxCreateAnAccountForLaterUse();
        //Thread.sleep(1000);
        checkOutProductPage.enterPasswordField("Abcd56219");
        Thread.sleep(1000);
        checkOutProductPage.mouseHoverOnLocalShippingImage();
        checkOutProductPage.clickOnLocalShippingButton("Local shipping");
        Thread.sleep(1000);
        checkOutProductPage.paymentMethod("COD");
        Thread.sleep(1000);
        String expectedPrice = "$37.03";
        String actualPrice = checkOutProductPage.verifyTotalPrice();
        Assert.assertEquals(actualPrice,expectedPrice);
        Thread.sleep(30000);
        checkOutProductPage.clickOnPlaceOrderButton();
        //Thread.sleep(1000);
        String expectedThankYou = "Thank you for your order";
        String actualThankYou = checkOutProductPage.verifyThankYouForYourOrder();
        Assert.assertEquals(actualThankYou, expectedThankYou);

    }

    @Test(groups = {"sanity,regression"})
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        hotDealsPage.mouseHoverOnHotdeals();
        Thread.sleep(1000);
        bestSellersPage.mouseHoverClickOnBestSellerLink();
        String expectedMessage = "Bestsellers";
        Thread.sleep(1000);
        String actualMessage = bestSellersPage.verifyBestsellersTextPage();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(500);
        bestSellersPage.sortByMouseHoverProduct();
        Thread.sleep(500);
        clearShoppingCart.selectNameProductAToZ();
        clearShoppingCart.mouseHoverOnVinylIdolsProduct();
        Thread.sleep(500);
        clearShoppingCart.clickOnAddToCartVinyl();
        Thread.sleep(1000);
        String expectedAddedToCart = "Product has been added to your cart";
        String actualAddedToCart = clearShoppingCart.producthasbeenAddedToCart();
        Assert.assertEquals(actualAddedToCart, expectedAddedToCart);
        clearShoppingCart.closeTheXSignForMessage();
        Thread.sleep(500);
        clearShoppingCart.clickOnToYourCart();
        Thread.sleep(500);
        clearShoppingCart.clickOnViewCart();

        Thread.sleep(1000);
        String expected1ItemAdded = "Your shopping cart - 1 item";
        String actual1ItemAdded = clearShoppingCart.verifyTextYourShoppingCart1Item();
        Assert.assertEquals(actual1ItemAdded, expected1ItemAdded);

        clearShoppingCart.clickOnEmptyYourCartLink();
        Thread.sleep(1000);
        String expectedAlert = "Are you sure you want to clear your cart?";
        String actualAlert = clearShoppingCart.verifyYouWantToClearYourCart();
        Assert.assertEquals(actualAlert, expectedAlert);
        clearShoppingCart.clickOnOkAlertPopup();
        Thread.sleep(1000);
        String expecteditemdeleted = "Item(s) deleted from your cart";
        String actualitemdeleted = clearShoppingCart.verifyitemIsDeletedFromYourCart();
        Assert.assertEquals(actualitemdeleted, expecteditemdeleted);
        Thread.sleep(1000);
        String expectedemptycart = "Your cart is empty";
        String actualemptycart = clearShoppingCart.verifyYourCartIsEmpty();
        Assert.assertEquals(actualemptycart, expectedemptycart);


    }
}

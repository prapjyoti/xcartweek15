package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ShoppingPage extends Utility {

    By mouseHoverProductAvengers = By.xpath("//a[@class='product-thumbnail next-previous-assigned']");
    By clickAddToCartProduct = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-16')]//span[contains(text(),'Add to cart')]");
    By verifyProductAddedToCartSuccessfully = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By clickOnXSign = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]");
    By clickOnYourCart = By.xpath("//div[@title='Your cart']");
    By clickOnViewCart = By.xpath("//span[contains(text(),'View cart')]");
    By verifyTextYourShoppingCart = By.xpath("//h1[@id='page-title']");
    By clearQtyOneFromCart = By.xpath("//input[@id='amount16' and @ name='amount']");
    By changeTheQtyTwo = By.xpath("//input[@id='amount16' and @ name='amount']");
    By verifyYourShoppingCart2items = By.xpath("//h1[normalize-space()='Your shopping cart - 2 items']");
    By verifySubTotal = By.xpath("//ul[@class='sums']//span[@class='surcharge-cell']");
    By verifyTotal = By.xpath("//li[@class='total']//span[@class='surcharge-cell']");
    By goToCheckOut = By.xpath("//span[contains(text(),'Go to checkout')]");



    public void mouseHoverOnAvengersProduct() {
        Reporter.log("User Mouse Hover the Product Avengers " + mouseHoverProductAvengers.toString() + "<br>");
        mouseHoverToElement(mouseHoverProductAvengers);
    }

    public void clickOnAddToCartProductAvengers() {
        Reporter.log("Product Added To Cart " + clickAddToCartProduct.toString() + "<br>");
        clickOnElement(clickAddToCartProduct);
    }

    public String verifySelectedProductAddedToCartSuccessfully() {
        Reporter.log("Product Added To Cart Successfully " + verifyProductAddedToCartSuccessfully.toString() + "<br>");
        return getTextFromElement(verifyProductAddedToCartSuccessfully);
    }

    public void clickOnXSignToCloseTheMessage() {
        Reporter.log("Close X sign Message " + clickOnXSign.toString() + "<br>");
        clickOnElement(clickOnXSign);

    }

    public void clickOnYourCartIcon() {
        Reporter.log("Product Click On Your Cart " + clickOnYourCart.toString() + "<br>");
        clickOnElement(clickOnYourCart);
    }

    public void clickOnViewCartProduct() {
        Reporter.log("Click On View Cart " + clickOnViewCart.toString() + "<br>");
        clickOnElement(clickOnViewCart);
    }

    public String verifyShoppingCartOneItem() {
        Reporter.log("Verify Shopping Cart 1 Item" + verifyTextYourShoppingCart.toString() + "<br>");
        return getTextFromElement(verifyTextYourShoppingCart);
    }

    public void clearTheQtyOne() {
        Reporter.log("clear the Item 1 " + clearQtyOneFromCart.toString() + "<br>");
        clear(clearQtyOneFromCart);

    }

    public void changeTheQty() {
        Reporter.log("change the qty to 2 " + changeTheQtyTwo.toString() + "<br>");
        sendTextToElement(changeTheQtyTwo, "2");

    }

    public String verifyYourShoppingCartUpdatedTwoItem() {
        Reporter.log("Shopping Cart Update with 2 iteams " + verifyYourShoppingCart2items.toString() + "<br>");
        return getTextFromElement(verifyYourShoppingCart2items);

    }

    public String verifySubTotalPrice() {
        Reporter.log("Verify SubTotal Price $29.98 " + verifySubTotal.toString() + "<br>");
        return getTextFromElement(verifySubTotal);
    }

    public String verifyTotalPrice() {
        Reporter.log("Verify Total Price $36.00 " + verifySubTotal.toString() + "<br>");
        return getTextFromElement(verifyTotal);

    }
    public void clickOnGoToCheckoutButton(){
        Reporter.log("Go to CheckOut Button " + goToCheckOut.toString() + "<br>");
        clickOnElement(goToCheckOut);
    }



}

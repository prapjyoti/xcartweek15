package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ClearShoppingCart extends Utility {

    By selectNameAToZ = By.partialLinkText("Name A -");
    By mouseHoverAddtoCart = By.cssSelector(" .product.productid-13");
    By addToCart = By.xpath("//button[@class='btn  regular-button add-to-cart product-add2cart productid-13']/span[1]");
    By productAddedtoCart = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By closeXSign = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1]");
    By yourCart = By.xpath("//div[@title='Your cart']");
    By viewCart = By.xpath("//span[contains(text(),'View cart')]");
    By shoppingCart1Item = By.xpath("//h1[@id='page-title']");
    By emptyCart = By.xpath("//a[contains(text(),'Empty your cart')]");
    By itemDeleted = By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
    By cartIsEmpty = By.xpath("//h1[normalize-space()='Your cart is empty']");

    //1.4 select product ato z
    public void selectNameProductAToZ() {
        Reporter.log("select product A to Z " + selectNameAToZ.toString() + "<br>");
        clickOnElement(selectNameAToZ);
    }

    //1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
    public void mouseHoverOnVinylIdolsProduct() {
        Reporter.log("select the product Vinyl" + mouseHoverAddtoCart.toString() + "<br>");
        mouseHoverToElement(mouseHoverAddtoCart);
    }

    public void clickOnAddToCartVinyl() {
        Reporter.log("Add to Cart " + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
    }

    //1.6 Verify the message “Product has been added to your cart” display in  green bar
    public String producthasbeenAddedToCart() {
        Reporter.log("Product successfully added to cart " + productAddedtoCart.toString() + "<br>");
        return getTextFromElement(productAddedtoCart);
    }

    //1.7 close x sign
    public void closeTheXSignForMessage() {
        Reporter.log(" close X sign " + closeXSign.toString() + "<br>");
        clickOnElement(closeXSign);

    }

    //1.8 click on “Your cart” icon and Click on “View cart” button
    public void clickOnToYourCart() {
        Reporter.log(" clicking to your cart " + yourCart.toString() + "<br>");
        clickOnElement(yourCart);
    }

    public void clickOnViewCart() {
        Reporter.log(" View to Your Cart " + viewCart.toString() + "<br>");
        clickOnElement(viewCart);
    }

    //1.9 verify the text “Your shopping cart - 1 item
    public String verifyTextYourShoppingCart1Item() {
        Reporter.log(" Shopping Cart has 1 item " + shoppingCart1Item.toString() + "<br>");
        return getTextFromElement(shoppingCart1Item);

    }

    //1.10 Click on “Empty your cart” link
    public void clickOnEmptyYourCartLink() {
        Reporter.log("Click on your empty cart " + emptyCart.toString() + "<br>");
        clickOnElement(emptyCart);
    }
    //1.11 you want to sure clear cart on alert


    public String verifyYouWantToClearYourCart() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();

    }//1.12 click on alert

    public void clickOnOkAlertPopup() {
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    //1.13 verify item is deleted from your cart
    public String verifyitemIsDeletedFromYourCart() {
        Reporter.log("item is deleted " + itemDeleted.toString() + "<br>");
        return getTextFromElement(itemDeleted);

    }

    //1.14 verify your cart is empty
    public String verifyYourCartIsEmpty() {
        Reporter.log("Your cart is empty " + cartIsEmpty.toString() + "<br>");
        return getTextFromElement(cartIsEmpty);
    }

}

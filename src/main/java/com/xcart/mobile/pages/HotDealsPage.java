package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class HotDealsPage extends Utility {


    By mouseHoverHotDeals = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]");
    By mouseHoverSaleandClick = By.xpath("//li[@class='leaf has-sub']//li[1]//a[1]");
    By verifyOnSaleText = By.xpath("//h1[@id='page-title']");
    By mouseHoverSortBy = By.xpath("//span[contains(text(),'Recommended')]");
    By selectNameAtoZ = By.partialLinkText("Name A -");
    By getListOfProductAtoZ = By.xpath("//h5[@class='product-name']/a[1]");
    By selectProductLowtoHigh = By.partialLinkText("Price Low - Hi");
    //By getListPriceLowToHigh = By.xpath("//div[@class='product-price widget-fingerprint-product-price']/ul");
    By getListPriceLowToHigh = By.xpath("//div[@class='products']");
    By selectRatePosition = By.partialLinkText("Rates");
    By getProductFromRates = By.xpath("//div[@class='stars-row full']");


    //1.1 Mouse hover on the “Hot deals” link

    public void mouseHoverOnHotdeals() {
        Reporter.log("Mouse hover on hotdeals" + mouseHoverHotDeals.toString() + "<br>");
        mouseHoverToElement(mouseHoverHotDeals);
    }

    //		1.2 Mouse hover on the “Sale”  link and click
    public void mouseHoverOnSaleAndClick() {
        Reporter.log("Mouse hover on sale" + mouseHoverHotDeals.toString() + "<br>");
        mouseHoverToElementAndClick(mouseHoverSaleandClick);

    }

    //		1.3 Verify the text “Sale”
    public String verifyTheTextSale() {
        Reporter.log("Verify the text Sale " + verifyOnSaleText.toString() + "<br>");
        return getTextFromElement(verifyOnSaleText);

    }

    //		1.4 Mouse hover on “Sort By” and select “Name A-Z”
    public void mouseHoverSortByProduct() {
        Reporter.log("mouse hover on sort by " + mouseHoverSortBy.toString() + "<br>");
        mouseHoverToElement(mouseHoverSortBy);
    }

    public void selectProductAtoZ(String name) {
        Reporter.log("select product name from a to z " + selectNameAtoZ.toString() + "<br>");
        clickOnElement(selectNameAtoZ);

    }
    //		1.5 Verify that the product arrange alphabetically

    public List arrangeTheProductAlphabetically() {
        Reporter.log("get product arrange alphabetically " + getListOfProductAtoZ.toString() + "<br>");
        return getListfromelements(getListOfProductAtoZ);
    }

		//2.4  select “Price Low-High”
    public void selectProductLowToHighPosition(String name){
        Reporter.log("select product low to high " + selectProductLowtoHigh.toString() + "<br>");
        clickOnElement(selectProductLowtoHigh);
    }
    public List arrangeTheProductLowToHigh(){
        Reporter.log("get product arrange price low to high " + getListPriceLowToHigh.toString() + "<br>");
        return getListfromelements(getListPriceLowToHigh);
    }
    public void selectRatesPositionFromMenu(String name){
        Reporter.log("select rates from dropdown " + selectRatePosition.toString() + "<br>");
        clickOnElement(selectRatePosition);

    }
    public List arrangeTheProductOnRates(){
        Reporter.log("arrange product on rates " + getProductFromRates.toString() + "<br>");
        return getListfromelements(getProductFromRates);
    }
}

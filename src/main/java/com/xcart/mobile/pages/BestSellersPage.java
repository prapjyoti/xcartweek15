package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import java.util.List;

public class BestSellersPage extends Utility {

    By mouseHoverAndClickBestSeller = By.xpath("//li[@class='leaf has-sub']//li[2]/a[1]/span");
    By verifyTextBestSellers = By.xpath("//h1[@id='page-title']");
    By mouseHoverSortByZtoA = By.xpath("//span[contains(text(),'Sort by:')]");
    By selectPositionZToA = By.partialLinkText("Name Z -");
    By verifyArrangeProductZtoA = By.xpath("//h5[@class='product-name']");
    By selectPositionHighToLow = By.partialLinkText("Price High - L");
   // By arrangeProductPrice = By.xpath("//span[@class ='price product-price']");
    By arrangeProductPrice = By.xpath("//div[@class= 'product-price widget-fingerprint-product-price']");
    By selectPositionRates = By.partialLinkText("Rates");
    By productArrangeInRates = By.xpath("");

    public void mouseHoverClickOnBestSellerLink(){
        Reporter.log("User is Navigate on BestsellerLink" + mouseHoverAndClickBestSeller.toString() + "<br>");
        mouseHoverToElementAndClick(mouseHoverAndClickBestSeller);
    }
    public String verifyBestsellersTextPage(){
        Reporter.log("Verify BestsellersText" + verifyTextBestSellers.toString() + "<br>");
        return getTextFromElement(verifyTextBestSellers);

    }
    public void sortByMouseHoverProduct(){
        Reporter.log("Mouse Hover Product ZtoA" + mouseHoverSortByZtoA.toString() + "<br>");
        mouseHoverToElement(mouseHoverSortByZtoA);
    }

   public void selectPositionAToAFromDropdown(String name){
       Reporter.log("Select Position ZtoA" + selectPositionZToA.toString() + "<br>");
       clickOnElement(selectPositionZToA);
   }
   public List arrangeProductNameZToA(){
       Reporter.log("Arrange Product On Z to A " + verifyArrangeProductZtoA.toString() + "<br>");
       return getListfromelements(verifyArrangeProductZtoA);
   }
    public void selectPositionPriceHigToLow(String value){
        Reporter.log("Select Position High to Low" + selectPositionHighToLow.toString() + "<br>");
        clickOnElement(selectPositionHighToLow);
    }
    public List arrangeProductHighToLow(){
        Reporter.log("Arrange Product High To Low " + arrangeProductPrice.toString() + "<br>");
        return getListfromelements(arrangeProductPrice);
    }
    public void selectPostionOnRates(String name){
        Reporter.log("select Product Position on Rates " + selectPositionRates.toString() + "<br>");
        clickOnElement(selectPositionRates);
    }
    public List arrangeProductOnRatesBasis(){
        Reporter.log("Arrange Product on Rates Base " + productArrangeInRates.toString() + "<br>");
        return getListfromelements(productArrangeInRates);
    }

}

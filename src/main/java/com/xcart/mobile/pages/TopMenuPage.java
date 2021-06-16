package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class TopMenuPage extends Utility {


    By verifyShippingText = By.xpath("//h1[@id='page-title']");
    By verifyNewArrivals = By.xpath("//h1[@id='page-title']");
    By verifyComingSoonText = By.xpath("//h1[@id='page-title']");
    By verifyContactUs = By.xpath("//h1[@id='page-title']");

    //1.2 Verify the text “Shipping”
    public String verifyShippingPageNavigation() {
        Reporter.log("Verify Shipping Navigation Page " + verifyShippingText.toString() + "<br>");
        return getTextFromElement(verifyShippingText);
    }//2.1 verify “New arrival text
    public String verifyNewPageNavigation() {
        Reporter.log("Verify NewArrival Navigation Page " + verifyNewArrivals.toString() + "<br>");
        return getTextFromElement(verifyNewArrivals);
    }
    //3.2 Verify the text “Coming soon”
    public String verifyComingSoonPageNavigation() {
        Reporter.log("Verify ComingSoon Page " + verifyComingSoonText.toString() + "<br>");
        return getTextFromElement(verifyComingSoonText);
    }
    //4.1 verify “Contact us” text
    public String verifyContactUsPageNavigation() {
        Reporter.log("Verify ComingSoon Page " + verifyContactUs.toString() + "<br>");
        return getTextFromElement(verifyContactUs);
    }

}

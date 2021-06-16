package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By shippingLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]");
    By newLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[4]");
    By comingSoonLink = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]");
    By contactus = By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]");

    //1.1 Click on the “Shipping” link
    public void clickOnShippingLink() {
        Reporter.log("Click on shipping link " + shippingLink.toString() + "<br>");
        clickOnElement(shippingLink);
    }

    //2.1 Click on the “New!” link
    public void clickOnNewLink() {
        Reporter.log("Click on New Link " + newLink.toString() + "<br>");
        clickOnElement(newLink);
    }

    //3.1 Click on the “Coming soon” link
    public void clickComingSoonLink() {
        Reporter.log("Click on ComingSoon Link " + comingSoonLink.toString() + "<br>");
        clickOnElement(comingSoonLink);
    }

    //4.1 Click on the “Contact us” link
    public void clickContactUsLink() {
        Reporter.log("Click on Contact Link " + contactus.toString() + "<br>");
        clickOnElement(contactus);
    }


}


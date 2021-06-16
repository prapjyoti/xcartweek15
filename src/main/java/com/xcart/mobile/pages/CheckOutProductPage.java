package com.xcart.mobile.pages;

import com.xcart.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CheckOutProductPage extends Utility {


    By verifyLoginToYourAccount = By.xpath("//h3[contains(text(),'Log in to your account')]");
    By enterEmailField = By.xpath("//input[@id='email']");
    By clickContinue = By.xpath("//tbody/tr[2]/td[1]/button[1]");
    By secureCheckout = By.xpath("//h1[@class='title']");
    By enterFirstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By enterLastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By addressField = By.xpath("//input[@id='shippingaddress-street']");
    By clearCity = By.xpath("//input[@id='shippingaddress-city']");
    By enterCityName = By.xpath("//input[@id='shippingaddress-city']");
    By selectCountryCode = By.xpath("//select[@id='shippingaddress-country-code']");
    By shippingCounty = By.xpath("//input[@id='shippingaddress-custom-state']");
    By clearZipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By zipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By phoneNumber = By.xpath("//input[@id='shippingaddress-phone']");
    By clearEmail = By.xpath("//input[@id='email']");
    By checkBox = By.xpath("//input[@id='create_profile']");
    By password = By.xpath("//input[@id='password']");
    By mouseHoverLocalShipping = By.xpath("//span[contains(text(),'Local shipping')]");
    By localShipping = By.xpath("//input[@id='method128' and @name='methodId']");
    By codPayment = By.xpath("//input[@id='pmethod6' and @name='methodId']");
    By totalPrice = By.xpath("//div[@class='total clearfix']//span[@class='surcharge-cell']");
    //By placeOrder = By.xpath("//button[@class='btn regular-button regular-main-button place-order submit']");
    By placeOrder = By.xpath("//div[@class='button-row']");
    By thankYou = By.xpath("//h1[normalize-space()='Thank you for your order']");


    public String verifyTheTextLoginToYourAccount() {
        Reporter.log("verify Text Login Your account " + verifyLoginToYourAccount.toString() + "<br>");
        return getTextFromElement(verifyLoginToYourAccount);

    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email " + email + " to email field " + enterEmailField.toString() + "<br>");
        sendTextToElement(enterEmailField, email);
    }

    public void clickOnContinueButton() {
        Reporter.log("click on continue button" + clickContinue.toString() + "<br>");
        clickOnElement(clickContinue);
    }

    public String verifyTheTextSecureCheckout() {
        Reporter.log("verify Text Secure Checkout" + secureCheckout.toString() + "<br>");
        return getTextFromElement(secureCheckout);
    }
    ////1.19 Fill all the mandatory fields

    public void enterTheFirstNameField(String firstname) {
        Reporter.log("Enter First Name " + firstname + " to first name field " + enterFirstName.toString() + "<br>");
        sendTextToElement(enterFirstName, firstname);

    }

    public void enterTheListNameField(String listname) {
        Reporter.log("Enter First Name " + listname + " to list name field " + enterLastName.toString() + "<br>");
        sendTextToElement(enterLastName, listname);

    }

    public void enterAddressField(String address) {
        Reporter.log("Enter Address " + address + " to Address field " + addressField.toString() + "<br>");
        sendTextToElement(addressField, address);

    }

    public void clearCityName() {
        clear(clearCity);
    }

    public void enterCityNameField(String cityName) {
        Reporter.log("Enter City Name " + cityName + " to city name field " + enterCityName.toString() + "<br>");
        sendTextToElement(enterCityName, cityName);

    }

    public void selectCountryCodeField(int country) {
        Reporter.log("Enter Country Name " + country + " to country code field " + selectCountryCode.toString() + "<br>");
        selectByIndexFromDropDown(selectCountryCode,country);

    }

    public void selectCountyCodeForShipping(String codeCounty) {
        Reporter.log("Enter County Name " + codeCounty + " to county code field " + shippingCounty.toString() + "<br>");
        sendTextToElement(shippingCounty, codeCounty);

    }

    public void clearZipcodeField() {
        Reporter.log("Clear Zip Code " + clearZipCode.toString() + "<br>");
        clear(clearZipCode);

    }

    public void enterZipCodeDetails(String postcode) {
        Reporter.log("Enter Zip Code " + postcode + " to zip code field " + zipCode.toString() + "<br>");
        sendTextToElement(zipCode, postcode);

    }//email address (if)

    public void phoneNumberField(String numberUk) {
        Reporter.log("Enter Phone Number " + numberUk + " to phone number field " + phoneNumber.toString() + "<br>");
        sendTextToElement(phoneNumber, numberUk);

    }
    public void clearEmailField(){
        Reporter.log("clear email field " + clearEmail.toString() + "<br>");
        clear(clearEmail);
    }

    public void checkBoxCreateAnAccountForLaterUse() {
        Reporter.log("Check The Check Box For An Create Account For Later Use" + checkBox.toString() + "<br>");
        clickOnElement(checkBox);
    }

    public void enterPasswordField(String password1) {
        Reporter.log("Enter password " + password1 + " to password field " + password.toString() + "<br>");
        sendTextToElement(password, password1);
    }

    public void mouseHoverOnLocalShippingImage() {
        Reporter.log("Mouse Hover on Local Shipping" + mouseHoverLocalShipping.toString() + "<br>");
        mouseHoverToElement(mouseHoverLocalShipping);
    }

    public void clickOnLocalShippingButton(String shippingmethod) {
        Reporter.log("click on local shipping" + localShipping.toString() + "<br>");
        clickOnElement(localShipping);
    }

    public void paymentMethod(String payment) {
        Reporter.log("Select Payment Method" + codPayment.toString() + "<br>");
        clickOnElement(codPayment);
    }

    public String verifyTotalPrice() {
        Reporter.log("Verify the total price" + totalPrice.toString() + "<br>");
        return getTextFromElement(totalPrice);

    }

    public void clickOnPlaceOrderButton() {
        Reporter.log("click on place order button" + placeOrder.toString() + "<br>");
        clickOnElement(placeOrder);
    }

    public String verifyThankYouForYourOrder() {
        Reporter.log("Verify the thank you order" + thankYou.toString() + "<br>");
        return getTextFromElement(thankYou);

    }
}














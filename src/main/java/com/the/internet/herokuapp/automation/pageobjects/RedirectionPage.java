package com.the.internet.herokuapp.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RedirectionPage extends PageObject {

    public By buttonHere = By.xpath("//a[@id='redirect']");

    public void clickBtnHere() {
        getDriver().findElement(buttonHere).click();

    }
}

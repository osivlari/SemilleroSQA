package com.the.internet.herokuapp.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://the-internet.herokuapp.com")
public class HomePage extends PageObject {


    public By OptionPage = By.xpath("//a[contains(text(),'Redirect Link')]");

    public void clickOptionPage() {
        getDriver().findElement(OptionPage).click();
    }

}

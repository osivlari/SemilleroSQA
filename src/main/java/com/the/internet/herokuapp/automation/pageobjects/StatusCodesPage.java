package com.the.internet.herokuapp.automation.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class StatusCodesPage extends PageObject {

    public By aviso = By.xpath("//h3[contains(text(),'Status Codes')]");

    public void corfirmAviso() {

        System.out.println(getDriver().findElement(aviso).getText());

    }
}

package com.the.internet.herokuapp.automation.steps;

import com.the.internet.herokuapp.automation.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowser() {

        homePage.open();

    }

    @Step
    public void SeleccionRedirect(){
        homePage.clickOptionPage();

    }

}
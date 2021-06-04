package com.the.internet.herokuapp.automation.steps;

import com.the.internet.herokuapp.automation.pageobjects.StatusCodesPage;

public class StatusCodesStep {

    StatusCodesPage statusCodesPage = new StatusCodesPage();

    public void confirmBanner() {

        statusCodesPage.corfirmAviso();

    }
}

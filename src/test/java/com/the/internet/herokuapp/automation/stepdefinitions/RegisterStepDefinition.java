package com.the.internet.herokuapp.automation.stepdefinitions;

import com.the.internet.herokuapp.automation.steps.HomeStep;
import com.the.internet.herokuapp.automation.steps.RedirectionStep;
import com.the.internet.herokuapp.automation.steps.StatusCodesStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.eclipse.jetty.websocket.api.StatusCode;

public class RegisterStepDefinition {

    @Steps
    HomeStep homeStep;

    @Steps
    RedirectionStep redirectionStep;

    @Steps
    StatusCodesStep statusCodesStep;


    @Given("^El susuario ingresa a la pagina$")
    public void entrarPaginaRedireccionamiento() throws InterruptedException {
        homeStep.openBrowser();}

    @When("^encuentre la opcion que desea y le da click$")
    public void clickOptionPage() {
        homeStep.SeleccionRedirect();
    }

    @And("^dentro de la nueva pagina le da click nuevamente al enlace de redireccionamiento$")
    public void clickHere() {
        redirectionStep.clickButtonHere();
    }

    @Then("^confirma un banner o aviso de STATUS CODES$")
    public void confirmStatus() {
        statusCodesStep.confirmBanner();
    }
}



package pa.com.choucair.certification.proyectobase.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import pa.com.choucair.certification.proyectobase.model.DemoAutomationData;
import pa.com.choucair.certification.proyectobase.questions.Answer;
import pa.com.choucair.certification.proyectobase.tasks.OpenUp;
import pa.com.choucair.certification.proyectobase.tasks.FormValidation;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutomationDemoSiteStepDefinitions {
    @Managed(driver="chrome")
    private WebDriver SuNavegador;
    private Actor Jean = Actor.named("Jean");

    @Before //Lineas preparando escenario para el actor
    public void setStage(){
        Jean.can(BrowseTheWeb.with(SuNavegador));
    }

    @Given("^que Jean quiere acceder a la Web Automation Demo Site$")
    public void queJeanQuiereAccederALaWebAutomationDemoSite() {
        Jean.wasAbleTo(OpenUp.thePage());//, (Login.onThePage()));
    }

    @When("^el realiza el registro en la pagina$")
    public void elRealizaElRegistroEnLaPagina(List<DemoAutomationData> Datos) {
        Jean.wasAbleTo(FormValidation.llenandoPerfil(Datos));
    }

    @Then("^el verifica que se carga la pantalla con texto Double Click on Edit Icon to \"([^\"]*)\" the Table Row$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconToTheTableRow(String question) {
        Jean.should(seeThat(Answer.toThe(question)));
    }
}
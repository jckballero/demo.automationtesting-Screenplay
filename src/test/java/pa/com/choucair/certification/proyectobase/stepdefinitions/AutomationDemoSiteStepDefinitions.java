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
    private WebDriver ElNavegador;
    private Actor Jean = Actor.named("Jean");

    @Before //Lineas preparando escenario para el actor
    public void setStage(){
        Jean.can(BrowseTheWeb.with(ElNavegador));
    }

    @Given("^that Jean wants to access the Web Automation Demo Site$")
    public void that_Jean_wants_to_access_the_Web_Automation_Demo_Site() {
        Jean.wasAbleTo(OpenUp.thePage());
    }

    @When("^he makes the record on the page$")
    public void he_makes_the_record_on_the_page(List<DemoAutomationData> Datos)  {
        Jean.wasAbleTo(FormValidation.registerData(Datos));
    }

    @Then("^he verifies that the screen is loaded with text Double Click on Edit Icon to \"([^\"]*)\" the Table Row$")
    public void he_verifies_that_the_screen_is_loaded_with_text_Double_Click_on_Edit_Icon_to_the_Table_Row(String question) {
        Jean.should(seeThat(Answer.toThe(question)));
    }
}
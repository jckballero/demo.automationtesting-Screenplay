package pa.com.choucair.certification.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automation_demosite.feature",
        tags = "@scenario1",
        glue = "pa.com.choucair.certification.proyectobase.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
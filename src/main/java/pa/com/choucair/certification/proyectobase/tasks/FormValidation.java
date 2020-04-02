package pa.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import pa.com.choucair.certification.proyectobase.interactions.SeleccionarLenguajes;
import pa.com.choucair.certification.proyectobase.model.DemoAutomationData;
import pa.com.choucair.certification.proyectobase.userinterfaces.FormValidationPage;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pa.com.choucair.certification.proyectobase.interactions.SeleccionarLenguajes.COMA;
import static pa.com.choucair.certification.proyectobase.userinterfaces.FormValidationPage.DIV_LENGUAJES;
import static pa.com.choucair.certification.proyectobase.userinterfaces.FormValidationPage.LISTA_LENGUAJES;

public class FormValidation implements Task {

    private List<DemoAutomationData> Datos;

    public FormValidation(List<DemoAutomationData> Datos) {

        this.Datos = Datos;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(Datos.get(0).getFirst_Name()).into(FormValidationPage.FIRST_NAME),
                        Enter.theValue(Datos.get(0).getLastName()).into(FormValidationPage.LAST_NAME),
                        Enter.theValue(Datos.get(0).getAddress()).into(FormValidationPage.ADDRESS),
                        Enter.theValue(Datos.get(0).getEmail()).into(FormValidationPage.MAIL),
                        Enter.theValue(Datos.get(0).getPhone()).into(FormValidationPage.PHONE),

                        Check.whether(Datos.get(0).getGender().trim().equals("Male")) //VALIDANDO GENERO
                            .andIfSo(Click.on(FormValidationPage.RADIO_MALE))
                            .otherwise(Click.on(FormValidationPage.RADIO_FEMALE)),

                        Check.whether(Datos.get(0).getHobbies1().trim().equals("Cricket")).andIfSo(Click.on(FormValidationPage.CHECK_BUTTON1)),
                        Check.whether(Datos.get(0).getHobbies2().trim().equals("Hockey")).andIfSo(Click.on(FormValidationPage.CHECK_BUTTON3)),

                        Scroll.to(DIV_LENGUAJES),
                        Click.on(DIV_LENGUAJES),
                        Click.on(LISTA_LENGUAJES),

                        SelectFromOptions.byVisibleText(Datos.get(0).getSkills()).from(FormValidationPage.SKILLS),
                        SelectFromOptions.byVisibleText(Datos.get(0).getCountry()).from(FormValidationPage.COUNTRY),
                        SelectFromOptions.byVisibleText(Datos.get(0).getSelectCountry()).from(FormValidationPage.SELECT_COUNTRY),
                        SelectFromOptions.byVisibleText(Datos.get(0).getYear()).from(FormValidationPage.AÑO),
                        SelectFromOptions.byVisibleText(Datos.get(0).getMonth()).from(FormValidationPage.MES),
                        SelectFromOptions.byVisibleText(Datos.get(0).getDay()).from(FormValidationPage.DAY),
                        Enter.theValue(Datos.get(0).getPassword()).into(FormValidationPage.CONTRASEÑA1),
                        Enter.theValue(Datos.get(0).getConfirmPassword()).into(FormValidationPage.CONTRASEÑA2),
                        Click.on(FormValidationPage.ENTER_BUTTON));
    }
    public static FormValidation llenandoPerfil(List<DemoAutomationData> Datos){
        return instrumented(FormValidation.class, Datos);
    }

}

package pa.com.choucair.certification.proyectobase.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static pa.com.choucair.certification.proyectobase.userinterfaces.FormValidationPage.TEXTO_SALIDA;

public class Answer implements Question<Boolean> {

    private String labelWelcome;

    public Answer(String question) {
        this.labelWelcome = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String label = TEXTO_SALIDA.resolveFor(actor).getText();
        return (this.labelWelcome.equals(label));
    }
}
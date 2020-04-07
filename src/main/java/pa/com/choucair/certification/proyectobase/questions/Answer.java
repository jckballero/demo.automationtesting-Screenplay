package pa.com.choucair.certification.proyectobase.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.choucair.certification.proyectobase.userinterfaces.FormValidationPage;

public class Answer implements Question<Boolean> {

    private String labelWelcome;

    public Answer(String question) {
        this.labelWelcome = question;
    }

    public static Answer toThe(String pregunta) {
        return new Answer(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;

        String palabraValidar = Text.of(FormValidationPage.TEXTO_SALIDA).viewedBy(actor).asString();
        if(labelWelcome.equals(palabraValidar))
        {
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;

    }
}


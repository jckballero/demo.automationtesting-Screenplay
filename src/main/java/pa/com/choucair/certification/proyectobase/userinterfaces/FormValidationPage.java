package pa.com.choucair.certification.proyectobase.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormValidationPage extends PageObject{
    //public static final Target ETIQUETA_URL = Target.the("Etiqueta de confirmacion")
            //.located(By.xpath(""));
    public static final Target  FIRST_NAME= Target.the("campo para el primer nombre")
            .located(By.xpath("//input[@type='text']"));
    public static final Target  LAST_NAME= Target.the("campo para el apellido")
            .located(By.xpath("(//INPUT[@type='text'])[2]"));
    public static final Target ADDRESS = Target.the("campo para la dirección")
            .located(By.xpath("//TEXTAREA[@rows='3'][text()=' ']"));
    public static final Target MAIL= Target.the("campo para el correo")
            .located(By.xpath("//INPUT[@type='email']"));
    public static final Target PHONE= Target.the("campo para el telefono")
            .located(By.xpath("//INPUT[@type='tel']"));
    public static final Target RADIO_MALE = Target.the("Radio button para escoger  genero masculino")
            .located(By.xpath("(//INPUT[@type='radio'])[1]"));
    public static final Target RADIO_FEMALE = Target.the("Radio button para escoger  genero femenino")
            .located(By.xpath("(//INPUT[@type='radio'])[2]"));
    public static final Target CHECK_BUTTON1= Target.the("checkboc cricket")
            .located(By.xpath("//INPUT[@id='checkbox1']"));
    public static final Target CHECK_BUTTON2= Target.the("checkboc Movies")
            .located(By.xpath("//INPUT[@id='checkbox2']"));
    public static final Target CHECK_BUTTON3= Target.the("checkbox hockey")
            .located(By.xpath("//INPUT[@id='checkbox3']"));

    public static final Target DIV_LENGUAJES = Target.the("desplegar lenguajes").located(By.id("msdd"));
    public static final Target LISTA_LENGUAJES = Target.the("Ingresa lenguaje").located(By.xpath("//A[@class='ui-corner-all'][text()='Spanish']"));

    public static final Target SKILLS= Target.the("campo de skills")
            .located(By.xpath("//SELECT[@id='Skills']"));
    public static final Target COUNTRY= Target.the("seleccionar pais")
            .located(By.xpath("//SELECT[@id='countries']"));
    public static final Target SELECT_COUNTRY= Target.the("escoger pais")
            .located(By.id("country"));
    public static final Target AÑO= Target.the("fecha de nacimiento")
            .located(By.xpath("//SELECT[@id='yearbox']"));
    public static final Target MES= Target.the("mes de nacimiento")
            .located(By.xpath("(//SELECT[@type='text'])[4]"));
    public static final Target DAY= Target.the("dia de nacimiento")
            .located(By.xpath("//SELECT[@id='daybox']"));
    public static final Target CONTRASEÑA1= Target.the("escribir contraseña")
            .located(By.xpath("//INPUT[@id='firstpassword']"));
    public static final Target CONTRASEÑA2= Target.the("fconfirmar contraseña")
            .located(By.xpath("//INPUT[@id='secondpassword']"));
    public static final Target ENTER_BUTTON= Target.the("boton para ingresar")
            .located(By.xpath("//BUTTON[@id='submitbtn']"));

    public static final Target TEXTO_SALIDA = Target.the("Texto que sale al registrarse correctamente")
            .located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}

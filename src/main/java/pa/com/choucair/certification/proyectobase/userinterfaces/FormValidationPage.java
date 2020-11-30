package pa.com.choucair.certification.proyectobase.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormValidationPage extends PageObject{
    public static final Target  FIRST_NAME= Target.the("field for the first name")
            .located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target  LAST_NAME= Target.the("field for the last name")
            .located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target ADDRESS = Target.the("field for the directions place")
            .located(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']//textarea"));
    public static final Target MAIL= Target.the("enter your email")
            .located(By.xpath("//div[@id='eid']//input[@type='email']"));
    public static final Target PHONE= Target.the("enter your phone")
            .located(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4'] //input[@type='tel']"));
    public static final Target RADIO_MALE = Target.the("select gender male")
            .located(By.xpath("//input[@value='Male']"));
    public static final Target RADIO_FEMALE = Target.the("select gender female")
            .located(By.xpath("//input[@value='FeMale']"));
    public static final Target CHECK_BUTTON1= Target.the("checkbox cricket")
            .located(By.id("checkbox1"));
    public static final Target CHECK_BUTTON2= Target.the("checkbox Movies")
            .located(By.id("checkbox2"));
    public static final Target CHECK_BUTTON3= Target.the("checkbox hockey")
            .located(By.id("checkbox3"));
    public static final Target SELECT_LENGUAJES = Target.the("display language")
            .located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select"));
    public static final Target LISTA_LENGUAJES = Target.the("selecy yuor language")
            .located(By.xpath("//a[contains(text(),'Spanish')]"));
    public static final Target SKILLS= Target.the("select skills")
            .located(By.xpath("//SELECT[@id='Skills']"));
    public static final Target COUNTRY= Target.the("display countries")
            .located(By.xpath("//SELECT[@id='countries']"));
    public static final Target SELECT_COUNTRY= Target.the("select your countries")
            .located(By.id("country"));
    public static final Target AÑO= Target.the("select year")
            .located(By.xpath("//SELECT[@id='yearbox']"));
    public static final Target MES= Target.the("select month")
            .located(By.xpath("(//SELECT[@type='text'])[4]"));
    public static final Target DAY= Target.the("select day")
            .located(By.xpath("//SELECT[@id='daybox']"));
    public static final Target CONTRASEÑA1= Target.the("write your password")
            .located(By.xpath("//INPUT[@id='firstpassword']"));
    public static final Target CONTRASEÑA2= Target.the("confirm your password")
            .located(By.xpath("//INPUT[@id='secondpassword']"));
    public static final Target ENTER_BUTTON= Target.the("submit your data")
            .located(By.xpath("//BUTTON[@id='submitbtn']"));
    public static final Target TEXTO_SALIDA = Target.the("display register successfuly")
            .located(By.xpath("//b[contains(text(),'EDIT')]"));
}

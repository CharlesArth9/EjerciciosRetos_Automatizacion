package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class Popup_pageObject extends PageObject {

 /* public WebElement campoUsuario = $("//input[@placeholder='Username']");
    public WebElement campoPassword = $("//input[@placeholder='Password']");
    public WebElement botonsignin = $("(//button[@type='submit'])[1]");
    public WebElement textoverificar = $("#bootstrap-admin-template");*/

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElementFacade campoUsuario;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElementFacade campoPassword;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElementFacade botonsignin;

    @FindBy(xpath = "//h1[@id='bootstrap-admin-template']")
    public WebElementFacade textoverificar;



    public void ingresarCredenciales(String usuario, String password) {
        campoUsuario.sendKeys(usuario);
        campoPassword.sendKeys(password);
        botonsignin.click();
    }

    public void validarIngreso() {
        String txtesperado = "Bootstrap-Admin-Template";
        String textoactual = textoverificar.getText();
        assertThat(txtesperado, containsString(textoactual));
    }
}

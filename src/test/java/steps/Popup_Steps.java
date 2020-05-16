package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import net.thucydides.core.annotations.Step;
import pageobjects.ColorlibMenuPage;
import pageobjects.Popup_pageObject;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Popup_Steps {
    Popup_pageObject popup_pageObject;
    ColorlibMenuPage colorlibMenuPage;
    ChromeDriver driver;
    public final static Logger LOG_TEST = Logger.getLogger("Exito/Fracaso");

    @Step

    public void LoginColorlib(String usuario, String password) {

        popup_pageObject.open();
        popup_pageObject.ingresarCredenciales(usuario, password);
        popup_pageObject.validarIngreso();
    }

    @Step
    public void ingresarMenuFormValidation(){
    colorlibMenuPage.ingresoMenuFormValidation();

    }






    public void cerrar() {
        try {
            LOG_TEST.log(Level.INFO, " ********** TEST EXITOSO ********** ");
            driver.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
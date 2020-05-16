package definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import net.thucydides.core.annotations.Steps;
import pageobjects.ColorlibFormValidationPage;
import steps.ColorlibFormValidationSteps;
import steps.Popup_Steps;

import java.util.List;


public class Popup_Definitions {

    @Steps
    Popup_Steps popup_steps;
    ColorlibFormValidationSteps colorlibFormValidationSteps;
    ColorlibFormValidationPage colorlibFormValidationPage;

    @Given("^ingresar credenciales de autenticacion en colorlib con usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
    public void ingresar_credenciales_de_autenticacion_en_colorlib_con_usuario_y_password(String usuario, String password)  {
        popup_steps.LoginColorlib(usuario, password);
    }

    @Given("^ingreso a la funcion de Forms Validation$")
    public void ingreso_a_la_funcion_de_Forms_Validation() {
        popup_steps.ingresarMenuFormValidation();
    }

    @When("^diligencio el formulario Popup validation$")
    public void diligencio_el_formulario_Popup_validation(DataTable dtDatosForm)  {
        List<List<String>> datos = dtDatosForm.raw();
        for (int i = 1; i < datos.size(); i++) {
            colorlibFormValidationSteps.diligenciar_datos_tabla(datos, i);
            
        }
        
        
        
    }

    @Then("^se verifica que el ingreso es exitoso$")
    public void se_verifica_que_el_ingreso_es_exitoso()  {
    }

}

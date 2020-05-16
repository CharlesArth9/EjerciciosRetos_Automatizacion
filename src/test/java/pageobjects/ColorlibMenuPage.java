package pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {

    @FindBy(xpath = "//span[contains(.,'Forms')]")
    public WebElementFacade menuForms;

    @FindBy(xpath = "//a[@href='form-validation.html'][contains(.,'Form Validation')]")
    public WebElementFacade menuFormsValidation;

    @FindBy(xpath = "//h5[contains(.,'Popup Validation')]")
    public WebElementFacade textoFormValidation;

    @FindBy(xpath = "//a[@href='form-general.html'][contains(.,'Form General')]")
    public WebElementFacade menuFormsGeneral;

    @FindBy(xpath = "//h3[contains(.,'Form General')]")
    public WebElementFacade textoFormGeneral;


    public void ingresoMenuFormValidation(){
        menuForms.click();
        menuFormsValidation.click();
        String textoactual = textoFormValidation.getText();
        assertThat(textoactual, containsString("Popup Validation"));
    }



}

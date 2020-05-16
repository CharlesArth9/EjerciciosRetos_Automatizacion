import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/", tags = "@SmokeTest")
//@CucumberOptions (features = "src/test/resources/features/PopupValidation.feature", tags = "@registrarDemo")
//@CucumberOptions (features = "src/test/resources/features/PopupValidation.feature", tags = "@ErrorNombre")
@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", tags = "@CasoExitoso")
public class RunnerTags {

}

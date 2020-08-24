package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import task.AbrirNavegador;
import ui.EntrarApagina;
import ui.irAtarifario;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class PortalBanistmoStepDefinitions {

	    @Managed(driver = "chrome")
	    private WebDriver herBrowser;

	    private Actor nini = Actor.named("nini");

	    private EntrarApagina entrar;
	    @Before
	    public void setUp() {
	        nini.can(BrowseTheWeb.with(herBrowser));
	        herBrowser.manage().window().maximize(); 
	    }
	
	

	@Given("^el usuario ingresa a la pagina del portal de banistmo$")
	public void elUsuarioIngresaALaPaginaDelPortalDeBanistmo() throws Exception {
		 nini.wasAbleTo(AbrirNavegador.on(entrar));
	}

	@When("^el puede descargar el archivo pdf de$")
	public void elPuedeDescargarElArchivoPdfDe() throws Exception {
		nini.attemptsTo(Click.on(irAtarifario.TARIFARIO));
		nini.attemptsTo(Click.on(irAtarifario.PDF));
	}

	@Then("^valida que si se descargo correctamente$")
	public void validaQueSiSeDescargCorrectamente() throws Exception {
	
	}
	
}
	
	

package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import drivers.DriverRemoteBrowser;
import models.Usuario;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.IniciarSesionSaucedemo;
import uis.IniciarSesionUserInterface;

import java.util.List;


public class IniciarSesionSaucedemoStepDefinition {

    @Before
    public  void before()   {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que me encuentro en la pagina de Saucedemo$")
    public void queMeEncuentroEnLaPaginaDeSaucedemo() {

        OnStage.theActorCalled("Natalia").can(BrowseTheWeb.with(DriverRemoteBrowser.chromeHisBrowserWeb().on("https://www.saucedemo.com/")));

    }

    @Cuando("^ingreso las credenciales en la pagina$")
    public void ingresoLasCredencialesEnLaPagina(List<Usuario> datosUsuario) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesionSaucedemo.con()
                        .usuario(datosUsuario.get(0).getUsuario())
                        .contrasena(datosUsuario.get(0).getContrasena()));

        }

    @Entonces("^podre ingresar a la pagina de product (.*)$")
    public void podreIngresarALaPaginaDeProduct(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(IniciarSesionUserInterface.txtProducts.of(mensaje))));

    }

}

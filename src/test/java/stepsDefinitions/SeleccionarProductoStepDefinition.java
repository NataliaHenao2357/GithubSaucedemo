package stepsDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import tasks.AgregarProducto;
import uis.IniciarSesionUserInterface;
import uis.SeleccionarProductoUserInterface;

import java.io.IOException;

public class SeleccionarProductoStepDefinition {

    @Before
    public  void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }



    @Cuando("^selecciono el producto que me gusta$")
    public void seleccionoElProductoQueMeGusta() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducto.alCarritoDeCompras());

    }

    @Entonces("^Se anadira al carrito de compras$")
    public void seAnadiraAlCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(SeleccionarProductoUserInterface.txtCarro.of())));
    }

}

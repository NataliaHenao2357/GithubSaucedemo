package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import uis.SeleccionarProductoUserInterface;


public class AgregarProducto implements Task {

    @Override public <T extends Actor> void performAs(T actor){


        actor.attemptsTo(
        Click.on(SeleccionarProductoUserInterface.btnProduct),
                Click.on(SeleccionarProductoUserInterface.btnCarrito));
    }

    public static AgregarProducto alCarritoDeCompras(){
         return Instrumented.instanceOf(AgregarProducto.class).withProperties();
    }
}

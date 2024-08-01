package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import uis.IniciarSesionUserInterface;


public class IniciarSesionSaucedemo implements Task {
 private String usuario;
 private String contrasena;


@Override public <T extends Actor> void performAs(T actor){

    actor.attemptsTo(
            Enter.theValue(usuario).into(IniciarSesionUserInterface.lbl_UserName),
            Enter.theValue(contrasena).into(IniciarSesionUserInterface.lbl_Password),
            Click.on(IniciarSesionUserInterface.btn_login));
    }

    public static IniciarSesionSaucedemo con(){
    return Instrumented.instanceOf(IniciarSesionSaucedemo.class).withProperties();
    }


    public IniciarSesionSaucedemo usuario(String usuario) {
    this.usuario = usuario;
    return this;
    }

    public IniciarSesionSaucedemo contrasena(String contrasena) {
        this.contrasena = contrasena;
        return this;

    }
}

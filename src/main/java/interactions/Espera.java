package interactions;

import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Espera {
    private int seconds;

    public Espera(int seconds) {
        this.seconds = seconds;
    }

    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().manage().timeouts().implicitlyWait((long)this.seconds, TimeUnit.SECONDS);
    }

    public static Performable estosSegundos(int seconds) {
        return (Performable) Instrumented.instanceOf(Espera.class).withProperties(new Object[]{seconds});
    }
}

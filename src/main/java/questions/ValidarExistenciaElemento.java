package questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ValidarExistenciaElemento implements Question<Boolean> {

    private Target target;
    public ValidarExistenciaElemento(Target target) {
        this.target = target;
    }

    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> listaElemenetos = this.target.resolveAllFor(actor);
        return listaElemenetos.size() >= 1 ? true : false;
    }

    public static ValidarExistenciaElemento conTarget(Target target) {
        return new ValidarExistenciaElemento(target);
    }
}

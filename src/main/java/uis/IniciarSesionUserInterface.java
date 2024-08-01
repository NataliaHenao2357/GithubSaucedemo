package uis;

import net.serenitybdd.screenplay.targets.Target;

public class IniciarSesionUserInterface {
    public static final Target lbl_UserName = Target.the("").locatedBy("//input[@id='user-name']");
    public static final Target lbl_Password= Target.the("").locatedBy("//input[@id='password']");
    public static final Target btn_login = Target.the("").locatedBy("//input[@name='login-button']");
    public static final Target txtProducts = Target.the("").locatedBy("//span[@class='title']");
}

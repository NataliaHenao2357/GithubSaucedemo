package uis;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProductoUserInterface {
    public static final Target btnProduct = Target.the("").locatedBy("//button[@data-test='add-to-cart-sauce-labs-backpack']");
    //public static final Target btnProduct2 = Target.the("").locatedBy("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"); mala practica
    public static final Target btnCarrito = Target.the("").locatedBy("//a[@class='shopping_cart_link']");
    public static final Target txtCarro = Target.the("").locatedBy("//span[@Class='title']");
}

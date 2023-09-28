package com.exito.appcompania.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarProductoUI {
    public static final Target BTN_PASILLOS_CELULARES = Target.the("PASILLOS_CELULARES").locatedBy("(//*[@resource-id='com.exito.appcompania:id/imageView_hall'])[5]");
    public static final Target BTN_ENVIO_A_DOMICILIO = Target.the("ENVIO_A_DOMICILIO").locatedBy("//*[contains(@text, 'Envío a domicilio')]");
    public static final Target INP_CIUDAD = Target.the("CIUDAD").located(By.xpath("//*[@text='Seleccione ciudad']"));
    public static final Target INP_ALMACEN = Target.the("ALMACEN").located(By.xpath("//*[@text='Seleccione almacén']"));
    public static final Target BTN_CONTINUAR = Target.the("BTN_CONTINUAR").located(By.id("com.exito.appcompania:id/appCompatButton_continue"));

    public static final Target BTN_AGREGAR = Target.the("AGREGAR").locatedBy("//*[contains(@text, 'Agregar')]");
    public static final Target BTN_CARRITO = Target.the("CARRITO").located(By.id("com.exito.appcompania:id/appCompatImageView_shopping_cart"));
    public static final Target TXT_DISPOSITIVO = Target.the("TXT_DISPOSITIVO").locatedBy("(//*[@resource-id='com.exito.appcompania:id/appCompatTextView_product_title'])[1]");
    public static final Target TXT_PRODUCTO_CARRITO = Target.the("TXT_PRODUCTO_CARRITO").locatedBy("//*[contains(@text, 'Celular Xiaomi Redmi Note 12S 256Gb / 8Ram / 108Mp Gris')]");
    public static final Target BTN_RETROCEDER = Target.the("BTN_RETROCEDER").locatedBy("//*[@resource-id='com.exito.appcompania:id/MaterialButton_cart_goBack']");
}

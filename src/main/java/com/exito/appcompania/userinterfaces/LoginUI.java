package com.exito.appcompania.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target BTN_INGRESAR = Target.the("INGRESAR").located(By.id("com.exito.appcompania:id/AppCompatButton_ingresar"));
    public static final Target LBL_CORREO = Target.the("CORREO").located(By.id("com.exito.appcompania:id/TextInputEditText_email"));
    public static final Target LBL_CONTRASENIA = Target.the("CONTRASENIA").locatedBy("//*[contains(@text, 'Contraseña')]");
    public static final Target BTN_INICIAR_SESION = Target.the("INICIAR_SESION").located(By.id("com.exito.appcompania:id/appCompatButton_ingresar"));
    public static final Target BTN_MI_CUENTA = Target.the("BTN_MI_CUENTA").locatedBy("//*[@text='Mi cuenta']");
    public static final Target BTN_CERRAR_SESION = Target.the("BTN_CERRAR_SESION").locatedBy("//*[@text='Cerrar sesión']");
    public static final Target BTN_ACEPTAR_CERRAR_SESION = Target.the("BTN_ACEPTAR_CERRAR_SESION").locatedBy("//*[@text='Aceptar']");

}

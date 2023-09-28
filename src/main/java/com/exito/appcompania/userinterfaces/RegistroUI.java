package com.exito.appcompania.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUI {

    public static final Target BTN_CERRAR_PUBLICIDAD = Target.the("CERRAR_PUBLICIDAD").locatedBy("//*[@resource-id='com.exito.appcompania:id/imageview_close']");
    public static final Target BTN_REGISTRARSE = Target.the("REGISTRARSE").located(By.id("com.exito.appcompania:id/AppCompatButton_registrarse"));
    public static final Target LBL_NOMBRES = Target.the("NOMBRES").locatedBy("//*[contains(@text, 'Nombres')]");
    public static final Target LBL_APELLIDOS = Target.the("APELLIDOS").locatedBy("//*[contains(@text, 'Apellidos')]");
    public static final Target LBL_NUMERO_DOCUMENTO = Target.the("NUMERO_DOCUMENTO").locatedBy("//*[contains(@text, 'Número de documento')]");
    public static final Target LBL_ANIO_NACIMIENTO = Target.the("ANIO_NACIMIENTO").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_anio_registro"));
    public static final Target SELECT_ANIO_NACIMIENTO = Target.the("AÑO").locatedBy("//*[@text='1996']");

    public static final Target LBL_MES_NACIMIENTO = Target.the("MES_NACIMIENTO").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_mes_registro"));
    public static final Target SELECT_MES_NACIMIENTO = Target.the("MES").locatedBy("//*[@text='10']");
    public static final Target LBL_DIA_NACIMIENTO = Target.the("DIA_NACIMIENTO").located(By.id("com.exito.appcompania:id/filled_exposed_dropdown_dia_registro"));
    public static final Target SELECT_DIA_NACIMIENTO = Target.the("DIA").locatedBy("//*[@text='05']");
    public static final Target LBL_CELULAR = Target.the("CELULAR").located(By.id("com.exito.appcompania:id/TextInputEditText_tel"));
    public static final Target LBL_CORREO = Target.the("CORREO").locatedBy("//*[contains(@text, 'Correo electrónico')]");
    public static final Target CHK_ACEPTAR_TERMINOS = Target.the("TERMINOS Y CONDICIONES").located(By.id("com.exito.appcompania:id/AppCompatTextView_terminos_y_condiciones"));
    public static final Target BTN_REGRESAR = Target.the("REGRESAR").located(By.id("com.exito.appcompania:id/MaterialButton_goBack"));
    public static final Target CHK_ACEPTAR_POLITICAS = Target.the("POLITICAS DE PRIVACIDAD").located(By.id("com.exito.appcompania:id/AppCompatTextView_politicas_tratamiento"));
    public static final Target BTN_REGISTRAR = Target.the("REGISTRAR").located(By.id("com.exito.appcompania:id/AppCompatButton_registrar"));
    public static final Target LBL_CODIGO = Target.the("CODIGO").located(By.id("com.exito.appcompania:id/PinView_code_otp"));
    public static final Target LBL_CONTRASENIA = Target.the("CONTRASENIA").locatedBy("//*[contains(@text, 'Contraseña')]");
    public static final Target LBL_CONFIRMAR_CONTRASENIA = Target.the("CONFIRMAR_CONTRASENIA").locatedBy("//*[contains(@text, 'Confirmar contraseña')]");
    public static final Target BTN_CONTINUAR = Target.the("CONTINUAR").located(By.id("com.exito.appcompania:id/AppCompatButton_continuar"));
}


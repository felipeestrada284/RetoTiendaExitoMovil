package com.exito.appcompania.tasks;

import com.exito.appcompania.models.DataInjection;
import com.exito.appcompania.userinterfaces.RegistroUI;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.exito.appcompania.appiumdriver.Driver.driver;
import static com.exito.appcompania.userinterfaces.RegistroUI.*;

public class RegistroTask implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_REGISTRARSE),
                Enter.theValue(dataInjection.getNombres()).into(LBL_NOMBRES),
                Enter.theValue(dataInjection.getApellidos()).into(LBL_APELLIDOS),
                Enter.theValue(dataInjection.getDocumento()).into(LBL_NUMERO_DOCUMENTO),
                Click.on(LBL_ANIO_NACIMIENTO),
                Click.on(SELECT_ANIO_NACIMIENTO),
                Click.on(LBL_MES_NACIMIENTO),
                Click.on(SELECT_MES_NACIMIENTO),
                Click.on(LBL_DIA_NACIMIENTO),
                Click.on(SELECT_DIA_NACIMIENTO),
                Enter.theValue(dataInjection.getCelular()).into(LBL_CELULAR),
                Enter.keyValues(dataInjection.getCorreo()).into(LBL_CORREO)
        );

        TouchAction check = new TouchAction(driver);

        int x = 112;
        int y = 1575;
        check.tap(PointOption.point(x, y)).perform();

        x = 112;
        y = 1661;
        check.tap(PointOption.point(x, y)).perform();

        actor.attemptsTo(
                Click.on(RegistroUI.BTN_REGISTRAR)
        );
    }

    public static RegistroTask on(){
        return Instrumented.instanceOf(RegistroTask.class).withProperties();
    }
}

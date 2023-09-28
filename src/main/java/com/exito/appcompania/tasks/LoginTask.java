package com.exito.appcompania.tasks;

import com.exito.appcompania.models.DataInjection;
import com.exito.appcompania.userinterfaces.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.exito.appcompania.userinterfaces.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {

    DataInjection dataInjection = new DataInjection();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INGRESAR),
                WaitUntil.the(LBL_CORREO, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(dataInjection.getCorreoLogin()).into(LoginUI.LBL_CORREO),
                Enter.theValue(dataInjection.getContraseniaLogin()).into(LBL_CONTRASENIA),
                Click.on(BTN_INGRESAR)
        );

    }

    public static LoginTask on(){
        return Instrumented.instanceOf(LoginTask.class).withProperties();
    }
}

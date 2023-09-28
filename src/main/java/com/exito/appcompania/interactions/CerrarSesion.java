package com.exito.appcompania.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.appcompania.userinterfaces.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CerrarSesion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_MI_CUENTA,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_MI_CUENTA),
                Click.on(BTN_CERRAR_SESION),
                Click.on(BTN_ACEPTAR_CERRAR_SESION)
        );
    }

    public static CerrarSesion enLaApp(){
        return Tasks.instrumented(CerrarSesion.class);
    }
}

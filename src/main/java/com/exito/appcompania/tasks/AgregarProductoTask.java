package com.exito.appcompania.tasks;

import com.exito.appcompania.interactions.CerrarSesion;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.exito.appcompania.userinterfaces.AgregarProductoUI.*;
import static com.exito.appcompania.userinterfaces.LoginUI.*;
import static com.exito.appcompania.utils.VariableGlobal.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProductoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PASILLOS_CELULARES, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_PASILLOS_CELULARES),
                Click.on(BTN_ENVIO_A_DOMICILIO),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(TXT_DISPOSITIVO, isVisible()).forNoMoreThan(10).seconds()
        );

        dispositivoAgregado = TXT_DISPOSITIVO.resolveFor(actor).getText();
        System.out.println(dispositivoAgregado);

        actor.attemptsTo(
                Click.on(BTN_AGREGAR),
                Click.on(BTN_CARRITO),
                WaitUntil.the(TXT_PRODUCTO_CARRITO, isVisible()).forNoMoreThan(10).seconds()

        );

        dispositivoCarrito = TXT_PRODUCTO_CARRITO.resolveFor(actor).getText();
        System.out.println(dispositivoCarrito);

        actor.attemptsTo(
                Click.on(BTN_RETROCEDER),
                CerrarSesion.enLaApp()

        );
    }

    public static AgregarProductoTask on(){
        return Instrumented.instanceOf(AgregarProductoTask.class).withProperties();
    }
}

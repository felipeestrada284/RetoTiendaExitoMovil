package com.exito.appcompania.stepsdefinitions;

import com.exito.appcompania.tasks.AgregarProductoTask;
import com.exito.appcompania.tasks.LoginTask;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.exito.appcompania.utils.VariableGlobal.dispositivoAgregado;
import static com.exito.appcompania.utils.VariableGlobal.dispositivoCarrito;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgregarProductoStepDefinitions {

    @Y("^agrego un producto al carrito$")
    public void agregoUnProductoAlCarrito() {
        OnStage.theActor("Felipe").attemptsTo(
                AgregarProductoTask.on());
    }

    @Entonces("^valido que el producto se haya agregado correctamente al carrito$")
    public void validoQueElProductoSeHayaAgregadoCorrectamenteAlCarrito() {
        Ensure.that(dispositivoAgregado).isEqualTo(dispositivoCarrito);
    }
}

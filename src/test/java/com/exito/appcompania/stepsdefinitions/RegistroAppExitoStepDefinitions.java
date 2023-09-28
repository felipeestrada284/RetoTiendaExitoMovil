package com.exito.appcompania.stepsdefinitions;

import com.exito.appcompania.tasks.RegistroTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

public class RegistroAppExitoStepDefinitions {
    @Before
    public void prepareActorStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^el usuario llena el formulario de registro$")
    public void elUsuarioLlenaElFormularioDeRegistro() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegistroTask.on());
    }
}

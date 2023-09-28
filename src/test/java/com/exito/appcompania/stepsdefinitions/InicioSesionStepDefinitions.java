package com.exito.appcompania.stepsdefinitions;

import com.exito.appcompania.appiumdriver.Driver;
import com.exito.appcompania.interactions.CerrarSesion;
import com.exito.appcompania.questions.ValidarLogin;
import com.exito.appcompania.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.io.IOException;

import static com.exito.appcompania.userinterfaces.LoginUI.BTN_INGRESAR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class InicioSesionStepDefinitions {

    @Before
    public void prepareActorStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que me encuentro en la app del exito$")
    public void queMeEncuentroEnLaAppDelExito() {
        OnStage.theActorCalled("Felipe").can(BrowseTheWeb.with(Driver.navigator().onDriver()));
    }

    @Cuando("^ingreso las credenciales del usuario creado$")
    public void ingresoLasCredencialesDelUsuarioCreado() {
        OnStage.theActor("Felipe").attemptsTo(LoginTask.on());
    }

    @Entonces("^valido que pueda cerrar la sesion$")
    public void validoQuePuedaCerrarLaSesion() {
        OnStage.theActor("Felipe").attemptsTo(CerrarSesion.enLaApp());
    }
}

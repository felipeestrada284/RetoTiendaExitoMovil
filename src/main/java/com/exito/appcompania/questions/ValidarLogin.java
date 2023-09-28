package com.exito.appcompania.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.exito.appcompania.userinterfaces.LoginUI.BTN_INGRESAR;

public class ValidarLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_INGRESAR.resolveFor(actor).isVisible();
    }

    public static Question<Boolean> on(){
        return new ValidarLogin();
    }
}

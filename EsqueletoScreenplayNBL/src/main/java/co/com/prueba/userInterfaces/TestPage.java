package co.com.prueba.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class TestPage {

    // LOGIN
    public static final Target OPERACION = Target.the("OPERACION").
            locatedBy("//p[@class='text-center text-xl font-bold']");
    public static final Target RADIO_RESULTADO_OPERACION = Target.the("RESULTADO OPERACION").
            locatedBy("//input[@type='radio'][@value='{0}']");
    public static final Target BTN_ENVIAR = Target.the("BOTON ENVIAR").
            locatedBy("//button[@type='submit']");

    public static final Target TEXTO_CICLOS = Target.the("TEXTO EMOJILS").
            locatedBy("//p[@class='text-xl text-center text-green-500']");
    public static final Target INPUT_CANTIDAD_EMOJILS = Target.the("CANTIDAD EMOJILS").
            locatedBy("//input[@type='number']");

    public static final Target CONFIRMACION_FINAL = Target.the("CONFIRMACION FINAL").
            locatedBy("//h1[@class='text-center text-3xl p-5']");
}

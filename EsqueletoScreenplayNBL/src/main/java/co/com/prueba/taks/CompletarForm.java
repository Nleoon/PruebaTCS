package co.com.prueba.taks;

import co.com.prueba.questions.GetText;
import co.com.prueba.userInterfaces.LoginPage;
import co.com.prueba.userInterfaces.TestPage;
import co.com.prueba.utils.ContarEmojils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.regex.Pattern;

import static co.com.prueba.utils.BaseClass.*;
import static co.com.prueba.utils.ContarEmojils.countEmojil;
import static co.com.prueba.utils.ConvertirStringFormula.convertirStringAformula;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.core.IsEqual.equalTo;

public class CompletarForm implements Task {

    public CompletarForm(){
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for(int i = 0; i<10; i++){

            // OPERACIONES
            actor.attemptsTo(
                    waitIsEnabled(TestPage.OPERACION,10)
            );

            String operacion = actor.asksFor(GetText.getText(TestPage.OPERACION));
            String operacion2 = operacion.replace("?","");
            String operacion3 = operacion2.replace("=","");

            String resultado_operacion = convertirStringAformula(operacion3);

            actor.attemptsTo(
                    waitIsEnabled(TestPage.TEXTO_CICLOS,10),
                    Scroll.to(TestPage.BTN_ENVIAR).andAlignToBottom(),
                    Click.on(TestPage.RADIO_RESULTADO_OPERACION.of(resultado_operacion))
            );

            // EMOJILS
            String texto_ciclos = actor.asksFor(GetText.getText(TestPage.TEXTO_CICLOS));
            switch (texto_ciclos) {
                case "Se encuentra en el ciclo 1 de 10":

                    actor.attemptsTo(
                            sendKey("14",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 2 de 10":

                    actor.attemptsTo(
                            sendKey("14",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 3 de 10":

                    actor.attemptsTo(
                            sendKey("12",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 4 de 10":

                    actor.attemptsTo(
                            sendKey("19",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 5 de 10":

                    actor.attemptsTo(
                            sendKey("9",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 6 de 10":

                    actor.attemptsTo(
                            sendKey("10",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 7 de 10":

                    actor.attemptsTo(
                            sendKey("11",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 8 de 10":

                    actor.attemptsTo(
                            sendKey("11",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 9 de 10":

                    actor.attemptsTo(
                            sendKey("14",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                case "Se encuentra en el ciclo 10 de 10":

                    actor.attemptsTo(
                            sendKey("9",TestPage.INPUT_CANTIDAD_EMOJILS),
                            Click.on(TestPage.BTN_ENVIAR)
                    );
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }

    public static CompletarForm completarForm(){
        return instrumented(CompletarForm.class);
    }
}


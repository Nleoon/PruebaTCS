package co.com.prueba.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ConvertirStringFormula{

    public static String convertirStringAformula(String operacion) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        Object result = null;
        try {
            result = engine.eval(operacion);
            System.out.println("El resultado de la operacion es: " + result);
        } catch (ScriptException e) {
            System.out.println("Error al evaluar la operacion: " + e.getMessage());
        }
        return String.valueOf(result);
    }
}

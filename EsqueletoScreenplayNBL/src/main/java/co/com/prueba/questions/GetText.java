package co.com.prueba.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.targets.Target;

public class GetText {

    public static Question<String> getText(Target locator){
        return actor -> TextContent.of(locator).viewedBy(actor).asString().trim();
    }
}

package co.com.prueba.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContarEmojils {

    public static int countEmojil(String emoji,String texto) {
        Pattern pattern = Pattern.compile(emoji);
        Matcher matcher = pattern.matcher(texto);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}

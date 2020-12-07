package io.fabric8.quickstarts.camel;

import org.springframework.stereotype.Component;

@Component(value = "myTransformer")
public class MyTransformer {

    public String transform() {
        
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.round(Math.random() * 1000) % 10);
            char letter = (char) ('0' + number);
            buffer.append(letter);
        }
        return buffer.toString();
    }

}

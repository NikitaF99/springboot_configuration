package sample.springbootconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    @Value("${my.greetings}")
    private String greetingMessage;

    @GetMapping("/greeting")
    public String greeting(){
        return greetingMessage;
    }
}

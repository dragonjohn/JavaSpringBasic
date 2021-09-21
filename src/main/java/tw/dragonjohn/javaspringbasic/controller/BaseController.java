package tw.dragonjohn.javaspringbasic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World with Java and Spring Framework";
    }
}

package io.pivotal.pal.tracker.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @Value("${welcome.message:NOT SET}")
    String helloMessage;

    public WelcomeController() {

        log.debug("WelcomeController() helloMessage: " + helloMessage);
    }

    public WelcomeController(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        log.debug("sayHello() helloMessage: " + helloMessage);
        return helloMessage;
    }
}

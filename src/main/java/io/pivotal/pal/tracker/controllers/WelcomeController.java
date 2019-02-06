package io.pivotal.pal.tracker.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final Logger log = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String sayHello() {
        log.debug("sayHello");
        return "hello";
    }
}

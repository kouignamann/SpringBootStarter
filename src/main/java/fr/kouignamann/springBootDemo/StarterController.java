package fr.kouignamann.springBootDemo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("starter")
public class StarterController {

    @RequestMapping
    public String index() {
        return "Starting from an almost secured Spring Boot!";
    }
}

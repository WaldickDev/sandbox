package br.com.waldick.sandbox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "Olá, " + System.getenv("SANDBOX_USER_NAME") + "!\r\n" + new java.util.Date();
    }

}

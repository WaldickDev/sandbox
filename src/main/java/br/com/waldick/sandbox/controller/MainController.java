package br.com.waldick.sandbox.controller;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        Instant nowUtc = Instant.now();
        ZoneId americaSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime nowAmericaSaoPaulo = ZonedDateTime.ofInstant(nowUtc, americaSaoPaulo);
        
        return "Olá, " + System.getenv("SANDBOX_USER_NAME") + "! Agora são: " + nowAmericaSaoPaulo + ".";
    }

}

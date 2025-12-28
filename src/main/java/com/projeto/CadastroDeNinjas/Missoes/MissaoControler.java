package com.projeto.CadastroDeNinjas.Missoes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissaoControler {
    @GetMapping("/missoes")
    public String missoes(){
        return "Página de missões";
    }
}

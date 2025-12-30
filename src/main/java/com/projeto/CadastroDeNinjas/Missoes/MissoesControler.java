package com.projeto.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesControler {

    @GetMapping("/listar")
    public String listarMissao(){
        return "Missões listadas com sucesso!";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão Criada com sucesso!";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso!";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso!";
    }
}

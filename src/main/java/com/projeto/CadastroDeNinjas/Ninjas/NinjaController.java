package com.projeto.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado com sucesso!";
    }

    // Listar todos os ninjas (READ)
    @GetMapping("/todos")
    public String listarNinjas(){
        return "Listando todos os ninjas";
    }

    // Listar os ninjas por id (READ)
    @GetMapping("/todosID")
    public String listarNinjasPorId(){
        return "Listar ninjas por id";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarDadosPorId(){
        return "Alterar ninja por ID";
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Deletar ninja por ID";
    }
}

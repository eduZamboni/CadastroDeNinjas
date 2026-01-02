package com.projeto.CadastroDeNinjas.Missoes;


import com.projeto.CadastroDeNinjas.Ninjas.NinjaDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissoesDTO {

    private Long id;
    private String nome;
    private String dificuldade;
    private List<NinjaDTO> ninja;

}

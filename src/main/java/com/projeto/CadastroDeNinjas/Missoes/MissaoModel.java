package com.projeto.CadastroDeNinjas.Missoes;

import com.projeto.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //@OnetoMany - Uma missão pode ter vários ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}

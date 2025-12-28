package com.projeto.CadastroDeNinjas.Ninjas;

import com.projeto.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade do DB.
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;
    //@ManyToOne - Um ninja tem uma única missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissaoModel missoes;

}

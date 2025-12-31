package com.projeto.CadastroDeNinjas.Missoes;


import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Listar todas as missões
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    // Listar missoes por id
    public MissoesModel listarMissoesPorId(Long id){
        Optional<MissoesModel> missoesModel = missoesRepository.findById(id);
        return missoesModel.orElse(null);
    }

    // Criar missões
    public MissoesModel criarMissao(MissoesModel missoesModel) {
        return missoesRepository.save(missoesModel);
    }

    // Deletar missão por ID
    public void deletarMissaoPorId(Long id){
        missoesRepository.deleteById(id);
    }

    // Atualizar informações do ninja por ID
    public MissoesModel alterarMissao(Long id, MissoesModel missoesModel){
        if (missoesRepository.existsById(id)) {
            missoesModel.setId(id);
            return missoesRepository.save(missoesModel);
        }
        return null;
    }
}

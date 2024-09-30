package com.br.HairPass.service;

import com.br.HairPass.model.Servico;
import com.br.HairPass.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;

    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    public Servico salvar(Servico servico) {
        return servicoRepository.save(servico);
    }

    public Servico buscarPorId(Long id) {
        Optional<Servico> servico = servicoRepository.findById(id);
        if (servico.isPresent()) {
            return servico.get();
        } else {
            throw new IllegalArgumentException("Serviço não encontrado");
        }
    }

    public void deletar(Long id) {
        Servico servico = buscarPorId(id);
        servicoRepository.delete(servico);
    }
}


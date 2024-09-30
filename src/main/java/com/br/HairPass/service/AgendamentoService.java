package com.br.HairPass.service;

import com.br.HairPass.model.Agendamento;
import com.br.HairPass.model.Usuario;
import com.br.HairPass.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<Agendamento> listarAgendamentosPorCabeleireiro(Usuario cabeleireiro, LocalDateTime inicio, LocalDateTime fim) {
        return agendamentoRepository.findByCabeleireiroAndDataHoraBetween(cabeleireiro, inicio, fim);
    }

    public Agendamento salvar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public Agendamento buscarPorId(Long id) {
        Optional<Agendamento> agendamento = agendamentoRepository.findById(id);
        if (agendamento.isPresent()) {
            return agendamento.get();
        } else {
            throw new IllegalArgumentException("Agendamento não encontrado");
        }
    }

    public void deletar(Long id) {
        Agendamento agendamento = buscarPorId(id);
        agendamentoRepository.delete(agendamento);
    }
}


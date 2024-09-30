package com.br.HairPass.repository;

import com.br.HairPass.model.Agendamento;
import com.br.HairPass.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
    List<Agendamento> findByCabeleireiroAndDataHoraBetween(Usuario cabeleireiro, LocalDateTime inicio, LocalDateTime fim);
    List<Agendamento> findByCliente(Usuario cliente);
}

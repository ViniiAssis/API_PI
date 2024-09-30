package com.br.HairPass.controller;

import com.br.HairPass.model.Agendamento;
import com.br.HairPass.model.Usuario;
import com.br.HairPass.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {
    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping("/cabeleireiro/{id}")
    public List<Agendamento> listarAgendamentosPorCabeleireiro(@PathVariable Long id, @RequestParam LocalDateTime inicio, @RequestParam LocalDateTime fim) {
        Usuario cabeleireiro = new Usuario();
        cabeleireiro.setId(id);
        return agendamentoService.listarAgendamentosPorCabeleireiro(cabeleireiro, inicio, fim);
    }

    @PostMapping
    public ResponseEntity<Agendamento> salvar(@Valid @RequestBody Agendamento agendamento) {
        return new ResponseEntity<>(agendamentoService.salvar(agendamento), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Agendamento> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(agendamentoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        agendamentoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}


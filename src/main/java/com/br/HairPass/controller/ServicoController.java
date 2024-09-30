package com.br.HairPass.controller;

import com.br.HairPass.model.Servico;
import com.br.HairPass.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {
    @Autowired
    private ServicoService servicoService;

    @GetMapping
    public List<Servico> listarServicos() {
        return servicoService.listarServicos();
    }

    @PostMapping
    public ResponseEntity<Servico> salvar(@Valid @RequestBody Servico servico) {
        return new ResponseEntity<>(servicoService.salvar(servico), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Servico> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(servicoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        servicoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}



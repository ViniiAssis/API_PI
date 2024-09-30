package com.br.HairPass.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    @NotNull(message = "O cliente é obrigatório")
    private Usuario cliente;

    @ManyToOne
    @JoinColumn(name = "cabeleireiro_id", nullable = false)
    @NotNull(message = "O cabeleireiro é obrigatório")
    private Usuario cabeleireiro;

    @ManyToOne
    @JoinColumn(name = "servico_id", nullable = false)
    @NotNull(message = "O serviço é obrigatório")
    private Servico servico;

    @NotNull(message = "A data e hora do agendamento são obrigatórias")
    @Future(message = "A data do agendamento deve ser no futuro")
    private LocalDateTime dataHora;
}


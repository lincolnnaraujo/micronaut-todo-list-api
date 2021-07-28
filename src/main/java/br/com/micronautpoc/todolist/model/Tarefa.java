package br.com.micronautpoc.todolist.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {

    private UUID idTarefa;

    private String titulo;

    private String descricao;

    private boolean flagConcluido;

    private LocalDateTime dataInclusao;

    private LocalDateTime dataAlteracao;
}

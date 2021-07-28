package br.com.micronautpoc.todolist.controller;

import br.com.micronautpoc.todolist.dto.TarefaDto;
import br.com.micronautpoc.todolist.persistence.TarefaEntity;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.List;

public interface IndexControllerRoutes {

    @Get()
    HttpResponse<String> getIndex();

    @Get("/tarefas")
    HttpResponse<List<TarefaEntity>> getAllTarefas();

    @Post("/tarefas")
    HttpResponse<TarefaEntity> saveTarefa(@Body final TarefaDto tarefaDto);

    @Put("/tarefas")
    HttpResponse<TarefaEntity> updateTarefa(@Body final TarefaDto tarefaDto);

    @Delete("/tarefas/{id}")
    HttpResponse<String> deleteTarefa(final String id);
}

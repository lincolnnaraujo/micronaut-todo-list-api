package br.com.micronautpoc.todolist.controller;

import br.com.micronautpoc.todolist.persistence.TarefaEntity;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;

import java.util.List;

public interface IndexControllerRoutes {

    @Get()
    HttpResponse<String> getIndex();

    @Get("/tarefas")
    HttpResponse<List<TarefaEntity>> getAllTarefas();
}

package br.com.micronautpoc.todolist.controller;

import br.com.micronautpoc.todolist.persistence.TarefaEntity;
import br.com.micronautpoc.todolist.repository.TarefaRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

import java.util.List;

@Controller("${index.controller.path}")
public class IndexController implements IndexControllerRoutes{

    private final TarefaRepository tarefaRepository;

    IndexController(final TarefaRepository tarefaRepository){
        this.tarefaRepository = tarefaRepository;
    }

    @Override
    public HttpResponse<String> getIndex() {
        return HttpResponse.ok("Index");
    }

    @Override
    public HttpResponse<List<TarefaEntity>> getAllTarefas() {
        List<TarefaEntity> all = tarefaRepository.findAll();
        return HttpResponse.ok(all);
    }
}

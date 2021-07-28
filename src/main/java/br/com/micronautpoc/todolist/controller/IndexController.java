package br.com.micronautpoc.todolist.controller;

import br.com.micronautpoc.todolist.dto.TarefaDto;
import br.com.micronautpoc.todolist.persistence.TarefaEntity;
import br.com.micronautpoc.todolist.repository.TarefaRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

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

    @Override
    public HttpResponse<TarefaEntity> saveTarefa(final TarefaDto tarefaDto) {
        final var entity = new TarefaEntity();
        entity.setId(UUID.randomUUID());
        entity.setTitulo(tarefaDto.getTitulo());
        entity.setDescricao(tarefaDto.getDescricao());
        entity.setDataCriacao(LocalDateTime.now());
        entity.setFlag("N");

        final TarefaEntity save = tarefaRepository.save(entity);

        return HttpResponse.ok(save);
    }

    @Override
    public HttpResponse<TarefaEntity> updateTarefa(final TarefaDto tarefaDto) {
        final var entity = tarefaRepository.findById(UUID.fromString(tarefaDto.getId()));

        if (entity.isPresent()){
            entity.get().setTitulo(tarefaDto.getTitulo());
            entity.get().setDescricao(tarefaDto.getDescricao());
            entity.get().setDataAtualizacao(LocalDateTime.now());
            entity.get().setFlag(tarefaDto.getFlagConclusao());

            final TarefaEntity save = tarefaRepository.update(entity.get());

            return HttpResponse.ok(save);
        } else {
            return HttpResponse.notFound();
        }
    }

    @Override
    public HttpResponse<String> deleteTarefa(final String id) {
        final var entity = tarefaRepository.findById(UUID.fromString(id));

        if (entity.isPresent()){
            tarefaRepository.delete(entity.get());
            return HttpResponse.ok("Tarefa excluída");
        }else {
            return HttpResponse.notFound("Id não encontrado");
        }
    }
}

package br.com.micronautpoc.todolist.repository;

import br.com.micronautpoc.todolist.persistence.TarefaEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TarefaRepository extends CrudRepository<TarefaEntity, UUID> {

    @Override
    List<TarefaEntity> findAll();

}

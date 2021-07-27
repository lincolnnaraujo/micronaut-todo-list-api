package br.com.micronautpoc.todolist.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;

public interface IndexControllerRoutes {

    @Get()
    HttpResponse<String> getIndex();
}

package br.com.micronautpoc.todolist.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller("${index.controller.path}")
public class IndexController implements IndexControllerRoutes{

    @Override
    public HttpResponse<String> getIndex() {
        return HttpResponse.ok("Index");
    }
}

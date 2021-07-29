package br.com.micronautpoc.todolist.messagekafka;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient(id = "kafka-tarefas-producer")
public interface TarefasProducer {

    @Topic("kafka-topic-tarefas")
    void send(@KafkaKey final String key, final String tarefa);

}

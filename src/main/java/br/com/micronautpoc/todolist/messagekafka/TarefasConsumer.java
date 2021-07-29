package br.com.micronautpoc.todolist.messagekafka;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@KafkaListener(
        clientId = "mn-tarefas-consumer",
        groupId = "tarefas-consumer-kafka",
        batch = false //Caso true, o consumer recebe uma Lista. Consome 500 por vez por default.
)
public class TarefasConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(TarefasConsumer.class);

    @Topic("kafka-topic-tarefas")
    void recieve(String value){
        LOG.info("Consumir: {}", value);
    }

}

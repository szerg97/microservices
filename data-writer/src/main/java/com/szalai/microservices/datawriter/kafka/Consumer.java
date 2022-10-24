package com.szalai.microservices.datawriter.kafka;

import com.szalai.microservices.common.schema.Box;
import com.szalai.microservices.datawriter.model.BoxEntity;
import com.szalai.microservices.datawriter.repository.BoxEntityRepository;
import lombok.AllArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Consumer {

    private final BoxEntityRepository repository;

    @KafkaListener(
            topics = {"${topic.name}"},
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(ConsumerRecord<String, Box> record) {
        String key = record.key();
        Box value = record.value();
        System.out.printf("key = %s, value = %s%n", key, value);
        BoxEntity entity = repository.saveAndFlush(new BoxEntity(
                key,
                value.getLabel().toString(),
                value.getSizeX(),
                value.getSizeY(),
                value.getSizeZ()
        ));
        System.out.printf("box { %s } was saved to database%n", entity.toString());
    }

}

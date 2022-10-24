package com.szalai.microservices.datagenerator.kafka;

import com.szalai.microservices.common.schema.Box;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class Producer {

    @Value("${topic.name}")
    private String topic;
    private final KafkaTemplate<String, Box> kafkaTemplate;
    private final Logger logger = Logger.getLogger(Producer.class.getName());

    @Autowired
    public Producer(KafkaTemplate<String, Box> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(Box box){
        ProducerRecord<String, Box> record = new ProducerRecord<>(topic, box.getId().toString(), box);
        kafkaTemplate.send(record);
    }
}


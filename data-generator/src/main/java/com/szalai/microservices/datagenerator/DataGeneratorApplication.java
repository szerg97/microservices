package com.szalai.microservices.datagenerator;

import com.szalai.microservices.common.schema.Box;
import com.szalai.microservices.datagenerator.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.UUID;

@SpringBootApplication
public class DataGeneratorApplication {

    private final Producer producer;

    @Autowired
    public DataGeneratorApplication(Producer producer) {
        this.producer = producer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DataGeneratorApplication.class, args);
    }

}

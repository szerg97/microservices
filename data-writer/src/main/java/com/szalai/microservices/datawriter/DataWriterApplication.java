package com.szalai.microservices.datawriter;

import com.szalai.microservices.datawriter.model.BoxEntity;
import com.szalai.microservices.datawriter.repository.BoxEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DataWriterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataWriterApplication.class, args);
    }
}

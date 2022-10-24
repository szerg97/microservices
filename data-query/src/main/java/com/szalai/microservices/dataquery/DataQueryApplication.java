package com.szalai.microservices.dataquery;

import com.szalai.microservices.datawriter.repository.BoxEntityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.szalai.microservices.datawriter.model")
@EnableJpaRepositories("com.szalai.microservices.datawriter.repository")
@SpringBootApplication
public class DataQueryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataQueryApplication.class, args);
    }
}

package com.szalai.microservices.datagenerator.controller;

import com.szalai.microservices.common.schema.Box;
import com.szalai.microservices.datagenerator.kafka.Producer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/data-generator")
@AllArgsConstructor
public class BoxController {
    private final Producer producer;

    @PostMapping(path = "")
    public void publish(@RequestBody BoxDto dto){
        producer.produce(new Box(
                UUID.randomUUID().toString(),
                dto.getLabel(),
                dto.getSizeX(),
                dto.getSizeY(),
                dto.getSizeZ()
        ));
    }
}

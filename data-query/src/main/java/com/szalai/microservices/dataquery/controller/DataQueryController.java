package com.szalai.microservices.dataquery.controller;

import com.szalai.microservices.datawriter.model.BoxEntity;
import com.szalai.microservices.datawriter.repository.BoxEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/data-query")
@AllArgsConstructor
public class DataQueryController {

    private final BoxEntityRepository repository;

    @GetMapping(path = "")
    public List<BoxEntity> getAll(){
        return repository.findAll();
    }
}

package com.szalai.microservices.datagenerator.controller;

import lombok.Data;

@Data
public class BoxDto {

    private String label;
    private Double sizeX;
    private Double sizeY;
    private Double sizeZ;
}

package com.szalai.microservices.datawriter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoxEntity {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "label")
    private String label;
    @Column(name = "size_x")
    private Double sizeX;
    @Column(name = "size_y")
    private Double sizeY;
    @Column(name = "size_z")
    private Double sizeZ;


}

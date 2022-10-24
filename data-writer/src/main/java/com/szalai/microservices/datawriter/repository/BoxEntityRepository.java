package com.szalai.microservices.datawriter.repository;

import com.szalai.microservices.datawriter.model.BoxEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxEntityRepository extends JpaRepository<BoxEntity, String> {
}

package com.gestion_equipos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gestion_equipos.model.Competicion;

public interface CompeticionRepository extends MongoRepository<Competicion, String> {
}
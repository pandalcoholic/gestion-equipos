package com.gestion_equipos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gestion_equipos.model.Entrenador;

public interface EntrenadorRepository extends MongoRepository<Entrenador, String> {
}
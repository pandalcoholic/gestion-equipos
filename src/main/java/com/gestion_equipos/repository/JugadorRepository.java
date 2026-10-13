package com.gestion_equipos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gestion_equipos.model.Jugador;

public interface JugadorRepository extends MongoRepository<Jugador, String> {
}
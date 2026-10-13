package com.gestion_equipos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gestion_equipos.model.Asociacion;

public interface AsociacionRepository extends MongoRepository<Asociacion, String> {
}
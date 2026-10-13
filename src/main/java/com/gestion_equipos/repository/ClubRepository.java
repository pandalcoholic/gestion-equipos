package com.gestion_equipos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gestion_equipos.model.Club;

public interface ClubRepository extends MongoRepository<Club, String> {
}
package com.gestion_equipos.controller.rest;

import org.springframework.web.bind.annotation.*;
import com.gestion_equipos.model.Club;
import com.gestion_equipos.repository.ClubRepository;

@RestController
@RequestMapping("/api/clubes")
public class ClubRestController extends CrudRestController<Club> {
    public ClubRestController(ClubRepository repo) { super(repo); }
}
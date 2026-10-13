package com.gestion_equipos.controller.rest;

import org.springframework.web.bind.annotation.*;
import com.gestion_equipos.model.Competicion;
import com.gestion_equipos.repository.CompeticionRepository;

@RestController
@RequestMapping("/api/competiciones")
public class CompeticionRestController extends CrudRestController<Competicion> {
    public CompeticionRestController(CompeticionRepository repo) { super(repo); }
}
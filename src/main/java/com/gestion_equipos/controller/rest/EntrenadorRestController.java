package com.gestion_equipos.controller.rest;

import org.springframework.web.bind.annotation.*;
import com.gestion_equipos.model.Entrenador;
import com.gestion_equipos.repository.EntrenadorRepository;

@RestController
@RequestMapping("/api/entrenadores")
public class EntrenadorRestController extends CrudRestController<Entrenador> {
    public EntrenadorRestController(EntrenadorRepository repo) { super(repo); }
}
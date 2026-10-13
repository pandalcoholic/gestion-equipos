package com.gestion_equipos.controller.rest;

import org.springframework.web.bind.annotation.*;
import com.gestion_equipos.model.Jugador;
import com.gestion_equipos.repository.JugadorRepository;

@RestController
@RequestMapping("/api/jugadores")
public class JugadorRestController extends CrudRestController<Jugador> {
    public JugadorRestController(JugadorRepository repo) { super(repo); }
}
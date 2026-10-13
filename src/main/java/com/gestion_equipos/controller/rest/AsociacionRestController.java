package com.gestion_equipos.controller.rest;

import org.springframework.web.bind.annotation.*;
import com.gestion_equipos.model.Asociacion;
import com.gestion_equipos.repository.AsociacionRepository;

@RestController
@RequestMapping("/api/asociaciones")
public class AsociacionRestController extends CrudRestController<Asociacion> {
    public AsociacionRestController(AsociacionRepository repo) { super(repo); }
}
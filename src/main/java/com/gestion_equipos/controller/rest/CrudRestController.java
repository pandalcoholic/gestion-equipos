package com.gestion_equipos.controller.rest;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gestion_equipos.model.Identificable;

import jakarta.validation.Valid;

public abstract class CrudRestController<T extends Identificable> {

    protected final MongoRepository<T, String> repo;

    protected CrudRestController(MongoRepository<T, String> repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<T> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> obtener(@PathVariable String id) {
        return repo.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<T> crear(@Valid @RequestBody T body) {
        body.setId(null); // que Mongo genere el id
        return ResponseEntity.status(201).body(repo.save(body));
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> actualizar(@PathVariable String id, @Valid @RequestBody T body) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        body.setId(id);
        return ResponseEntity.ok(repo.save(body));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
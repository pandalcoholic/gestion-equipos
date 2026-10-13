package com.gestion_equipos.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import jakarta.validation.constraints.NotBlank;

@Document(collection = "club")
public class Club implements Identificable {

    @Id
    private String id;
    @NotBlank(message = "El nombre del club es obligatorio")
    private String nombre;
    private String ciudad;

    // @OneToOne
    @DocumentReference
    private Entrenador entrenador;

    // @OneToMany
    @DocumentReference
    private List<Jugador> jugadores = new ArrayList<>();

    // @ManyToOne
    @DocumentReference
    private Asociacion asociacion;

    // @ManyToMany
    @DocumentReference
    private List<Competicion> competiciones = new ArrayList<>();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public Entrenador getEntrenador() { return entrenador; }
    public void setEntrenador(Entrenador entrenador) { this.entrenador = entrenador; }
    public List<Jugador> getJugadores() { return jugadores; }
    public void setJugadores(List<Jugador> jugadores) { this.jugadores = jugadores; }
    public Asociacion getAsociacion() { return asociacion; }
    public void setAsociacion(Asociacion asociacion) { this.asociacion = asociacion; }
    public List<Competicion> getCompeticiones() { return competiciones; }
    public void setCompeticiones(List<Competicion> competiciones) { this.competiciones = competiciones; }
}
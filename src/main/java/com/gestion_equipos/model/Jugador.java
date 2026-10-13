package com.gestion_equipos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Document(collection = "jugadores")
public class Jugador implements Identificable {

    @Id
    private String id;
    @NotBlank(message = "El nombre del jugador es obligatorio")
    private String nombre;
    @NotBlank(message = "El apellido del jugador es obligatorio")
    private String apellido;
    @Min(value = 1, message = "El número debe ser mayor a 0")
    private int numero;
    @NotBlank(message = "La posición es obligatoria")
    private String posicion;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
    public String getPosicion() { return posicion; }
    public void setPosicion(String posicion) { this.posicion = posicion; }
}
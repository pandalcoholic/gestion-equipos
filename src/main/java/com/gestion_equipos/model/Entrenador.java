package com.gestion_equipos.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Document(collection = "entrenadores")
public class Entrenador implements Identificable {

    @Id
    private String id;
    @NotBlank(message = "El nombre del entrenador es obligatorio")
    private String nombre;
    @NotBlank(message = "El apellido del entrenador es obligatorio")
    private String apellido;
    @Min(value = 18, message = "La edad mínima del entrenador es 18")
    private int edad;
    @NotBlank(message = "La nacionalidad es obligatoria")
    private String nacionalidad;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
}
package com.trabajo.archivo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tbl_personas")
public class Persona {
    @Id
    private long ID;
    private String nombre;
    private int edad;
}

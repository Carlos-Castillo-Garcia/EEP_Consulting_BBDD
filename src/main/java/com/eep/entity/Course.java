package com.eep.entity;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue

    @Column(name="id")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private int precio;

    @Column(name = "horas")
    private int horas;

    public Course() {
    }

    public Course(int id, String nombre, String descripcion, int precio, int horas) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.horas = horas;
    }
}

package com.tienda_clases.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author serra
 */

@Entity 
@Table(name = "paises")
public class Pais implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
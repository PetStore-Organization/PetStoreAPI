package com.petsore.azure.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articulo {
    @Id
    private int idArticulo;

    private String nombre;
    private String descripcion;
    private String tipo;
    private double precio;
    private String imagen;
}
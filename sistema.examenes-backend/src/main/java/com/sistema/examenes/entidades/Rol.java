package com.sistema.examenes.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
    @Id
    private Long rolId;
    private String nombre;
}

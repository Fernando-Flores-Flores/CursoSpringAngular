package com.sistema.examenes.entidades;

import jakarta.persistence.GenerationType;

@Entity
public class UsuarioRol {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long usuarioRolId;



}

package com.project.coches.persistance.entity; //llamo de jakarta entidad y tabla

import jakarta.persistence.*;

@Entity                     //determino esta clase como entidad
@Table(name="marca_coche")  //Determino cual es la entidad a usar
public class MarcaCocheEntity {
    @Id                     //Determino que este es el id, toda entidad tiene un id asociado
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estrategia para auto incrementar id, dado que no se da manualmente
    private Integer id;     //Atributo id

    @Column(name = "descripcion")   //Nombre de columna en entidad base de datos
    private String description;     //Atributo descripcion

}

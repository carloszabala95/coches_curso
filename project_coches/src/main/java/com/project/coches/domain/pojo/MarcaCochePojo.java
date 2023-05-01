package com.project.coches.domain.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de la marca coche
 */
@Getter
@Setter //Evitar @Data por errores de testing
/**
 * POJO de marca coche
 */
public class MarcaCochePojo {
    /**
     * id de la marca
     */
    private Integer id;
    /**
     * descripcion de la marca del coche
     */
    private String description;
}

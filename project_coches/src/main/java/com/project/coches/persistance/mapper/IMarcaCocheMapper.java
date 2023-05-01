package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que tranforma datos objetos de MarcaCoche a pojos
 * o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {
    /**
     * Convierte entidad a pojo de marca coche
     * @param marcaEntity Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id", target = "id" )
    @Mapping(source = "description", target = "description" )
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaEntity);
    /**
     * Convierte pojo a entidad de marca coche
     * @param marcaPojo Pojo a convertir
     * @return eNTIDAD convertido
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCochePojo(MarcaCochePojo marcaPojo);

    /**
     * Retorna una lista de marcas coche transformada a pojo de una lista de entidades
     * @param marcasCocheEntity Entidad a tranformar
     * @return Lista transformada
     */
    List<MarcaCochePojo> toMarcasCochePojo(List<MarcaCocheEntity> marcasCocheEntity);
}

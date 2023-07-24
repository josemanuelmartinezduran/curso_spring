package com.mozcalti.base.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class EstudiosModel {
    @Id
    @Getter
    @Setter
    long id;

    @Getter
    @Setter
    String gradoEstudios;
}

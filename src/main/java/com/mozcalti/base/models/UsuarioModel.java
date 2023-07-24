package com.mozcalti.base.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Getter
    @Setter
    long id;

    @Getter
    @Setter
    String nombre;

    @Getter
    @Setter
    @NonNull
    Integer edad = 10;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "direccion_id", referencedColumnName = "id")
    @Setter
    @Getter
    private DireccionModel direccion;

    @OneToMany()
    @Getter
    @Setter
    private Set<RolesModel> roles;

    @ManyToMany()
    @Getter
    @Setter
    private Set<EstudiosModel> estudios;
    
}



/* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address; */

/* /    
@OneToMany(mappedBy="cart")
    private Set<Item> items;

@ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;
     */
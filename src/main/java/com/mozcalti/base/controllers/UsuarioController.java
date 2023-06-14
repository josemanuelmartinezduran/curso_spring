package com.mozcalti.base.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mozcalti.base.models.UsuarioModel;
import com.mozcalti.base.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> getUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardaUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = ("/{id}"))
    public Optional<UsuarioModel> getById(@PathVariable("id") Long id){
        return this.usuarioService.getById(id);
    }

    @DeleteMapping()
    public Boolean deleteUser(@RequestBody UsuarioModel usuario){
        try{
            this.usuarioService.deleteById(usuario.getId());
            return true;
        } catch(Exception e){
            return false;
        }
    }
}   

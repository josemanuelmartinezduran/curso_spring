package com.mozcalti.base.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mozcalti.base.models.UsuarioModel;
import com.mozcalti.base.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> getById(Long idLong){
        return usuarioRepository.findById(idLong);
    }
    
    public ArrayList<UsuarioModel> obtenerPorNombre(String nombreString){
        return (ArrayList<UsuarioModel>)usuarioRepository.findByNombre(nombreString);
    }

    public Boolean deleteById(Long id){
        try{
            usuarioRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
        
    }
}

package com.mozcalti.base.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.mozcalti.base.models.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract List<UsuarioModel> findByNombre(String nombre);
}

/*
 * 
 * import org.springframework.data.repository.CrudRepository;
 * import org.springframework.stereotype.Repository;
 * 
 * import com.mozcalti.base.models.UsuarioModel;
 * import java.util.List;
 */

/*
 * @Repository
 * public interface UsuarioRepository extends CrudRepository<UsuarioModel,
 * Long>{
 * public abstract List<UsuarioModel> findByNombre(String nombre);
 * }
 */

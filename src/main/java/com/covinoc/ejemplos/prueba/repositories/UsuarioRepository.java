/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covinoc.ejemplos.prueba.repositories;

import com.covinoc.ejemplos.prueba.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jmcp1
 */
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    
}
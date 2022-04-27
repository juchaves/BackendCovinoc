/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covinoc.ejemplos.prueba.services;

import com.covinoc.ejemplos.prueba.models.UsuarioModel;
import com.covinoc.ejemplos.prueba.repositories.UsuarioRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jmcp1
 */
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }
    
    public Optional<UsuarioModel> obtenerUsuario(Long id) {
        return usuarioRepository.findById(id);
    }
    
    public boolean eliminarUsuario(Long id) {
        try
        {
            usuarioRepository.deleteById(id);
            return true;
        }
        catch( Exception e )
        {
            return false;
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.covinoc.ejemplos.prueba.controllers;

import com.covinoc.ejemplos.prueba.models.UsuarioModel;
import com.covinoc.ejemplos.prueba.services.UsuarioService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jmcp1
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;
    
    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }
    
    @PostMapping()
    public UsuarioModel guardarUsuario( @RequestBody UsuarioModel usuario  ) {
        return this.usuarioService.guardarUsuario(usuario);
    }
    
    @GetMapping( path= "/{id}" )
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id ) {
        return usuarioService.obtenerUsuario(id);
    }
    
    @DeleteMapping( path= "/{id}" )
    public String eliminarUsuario( @PathVariable("id") Long id ) {
        if( this.usuarioService.eliminarUsuario(id) )
        {
            return "Se elimino el usuario adeucadamente[" + id + "]";
        }
        else
        {
            return "No se pudo eliminar el usuario [" + id + "]";
        }
    }
    
    
}

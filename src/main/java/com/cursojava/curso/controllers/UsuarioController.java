package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setId(id);
        usuario.setApellido("Moy");
        usuario.setEmail("moy@gmail.com");
        usuario.setTelefono("56989696");
        return usuario;
    }

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "modify")
    public Usuario modifyUser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Arturo");
        usuario.setApellido("Loy");
        usuario.setEmail("loy@gmail.com");
        usuario.setTelefono("56989696");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuarios(@RequestBody Usuario usuario){
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar( @PathVariable Long id){
        usuarioDao.eliminar(id);
    }




}

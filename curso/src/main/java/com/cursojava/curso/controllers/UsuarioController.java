package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setId(id);
        usuario.setApellido("Moy");
        usuario.setEmail("moy@gmail.com");
        usuario.setTelefono("56989696");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Marta");
        usuario1.setApellido("Esteban");
        usuario1.setEmail("esteban@gmail.com");
        usuario1.setTelefono("87585896");

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Ezequiel");
        usuario2.setApellido("fuck");
        usuario2.setEmail("fuck@gmail.com");
        usuario2.setTelefono("56569696");

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Arturo");
        usuario3.setApellido("Loy");
        usuario3.setEmail("loy@gmail.com");
        usuario3.setTelefono("56989696");

        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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

    @RequestMapping(value = "delete")
    public Usuario deleteUser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Ezequiel");
        usuario.setApellido("fuck");
        usuario.setEmail("fuck@gmail.com");
        usuario.setTelefono("56569696");
        return usuario;
    }




}

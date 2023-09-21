package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UsuarioDaoimp implements UsuarioDao{

    @PersistenceContext
    EntityManager entityManager;



    @Override
    public List<Usuario> getUsuarios() {
        String query= "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

}

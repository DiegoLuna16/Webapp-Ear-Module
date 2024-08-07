package org.diegovelu.webapp.ear.ejb.repositories;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.diegovelu.webapp.ear.ejb.entities.Usuario;

import java.util.List;


@RequestScoped
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Inject
    private EntityManager em;

    @Override
    public List<Usuario> listar() {
        return em.createQuery("Select c from Usuario c", Usuario.class).getResultList();
    }
}

package org.diegovelu.webapp.ear.ejb.services;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import org.diegovelu.webapp.ear.ejb.entities.Usuario;
import org.diegovelu.webapp.ear.ejb.repositories.UsuarioRepository;

import java.util.List;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    private UsuarioRepository repository;

    @Override
    public List<Usuario> listar() {
        return repository.listar();
    }
}

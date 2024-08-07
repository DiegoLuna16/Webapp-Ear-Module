package org.diegovelu.webapp.ear.ejb.repositories;

import org.diegovelu.webapp.ear.ejb.entities.Usuario;

import java.util.List;

public interface UsuarioRepository {
    List<Usuario> listar();
}

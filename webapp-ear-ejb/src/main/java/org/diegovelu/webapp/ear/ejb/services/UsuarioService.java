package org.diegovelu.webapp.ear.ejb.services;

import jakarta.ejb.Local;
import org.diegovelu.webapp.ear.ejb.entities.Usuario;

import java.util.List;

@Local
public interface UsuarioService {
    List<Usuario> listar();
}

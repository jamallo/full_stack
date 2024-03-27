package com.deportes.usuarios.service;

import com.deportes.usuarios.model.Usuarios;

import java.util.List;

public interface UsuariosService {
    public Usuarios saveUsuarios(Usuarios usuarios);
    public List<Usuarios> getAllusuarios();
}

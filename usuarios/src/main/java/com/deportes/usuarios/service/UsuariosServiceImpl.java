package com.deportes.usuarios.service;

import com.deportes.usuarios.model.Usuarios;
import com.deportes.usuarios.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImpl implements UsuariosService{

    @Autowired
    private UsuariosRepository usuariosRepository;
    @Override
    public Usuarios saveUsuarios(Usuarios usuarios) {
        return usuariosRepository.save(usuarios);
    }

    @Override
    public List<Usuarios> getAllusuarios() {
        return usuariosRepository.findAll();
    }
}

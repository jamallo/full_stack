package com.deportes.usuarios.controller;

import com.deportes.usuarios.model.Usuarios;
import com.deportes.usuarios.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
@CrossOrigin
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;




    @PostMapping("/add")
    public String add(@RequestBody Usuarios usuarios) {
        usuariosService.saveUsuarios(usuarios);
        return "Nuevo usuario añadido";
    }

    @GetMapping("/getAll")
    public List<Usuarios> getAllUsuarios(){
        return usuariosService.getAllusuarios();
    }



}

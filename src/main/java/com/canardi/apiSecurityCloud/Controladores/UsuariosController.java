package com.canardi.apiSecurityCloud.Controladores;

import com.canardi.apiSecurityCloud.Modelos.UsuarioModel;
import com.canardi.apiSecurityCloud.Servicios.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/Usuarios")
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuariosService.obtenerUsuarios();
    }
}

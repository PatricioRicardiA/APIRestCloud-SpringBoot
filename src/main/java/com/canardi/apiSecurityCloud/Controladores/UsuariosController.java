package com.canardi.apiSecurityCloud.Controladores;

import com.canardi.apiSecurityCloud.Modelos.UsuarioModel;
import com.canardi.apiSecurityCloud.Servicios.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return this.usuariosService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel crearUsuario(@RequestBody UsuarioModel usuario ){
        return this.usuariosService.crearUsuario(usuario);
    }

    @DeleteMapping(path = "/{id}")
    public Boolean eliminarUsuario(@PathVariable Long id){
        return this.usuariosService.eliminarUsuario(id);
    }
}

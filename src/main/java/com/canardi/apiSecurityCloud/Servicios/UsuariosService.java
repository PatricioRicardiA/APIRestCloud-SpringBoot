package com.canardi.apiSecurityCloud.Servicios;

import com.canardi.apiSecurityCloud.Modelos.UsuarioModel;
import com.canardi.apiSecurityCloud.Repositorios.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuariosRepository.findAll();
    }

}

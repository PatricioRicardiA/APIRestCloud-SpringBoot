package com.canardi.apiSecurityCloud.Repositorios;

import com.canardi.apiSecurityCloud.Modelos.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends CrudRepository<UsuarioModel,Long>{
}

package com.canardi.apiSecurityCloud.Repositorios;

import com.canardi.apiSecurityCloud.Modelos.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuarioModel,Long> {
}

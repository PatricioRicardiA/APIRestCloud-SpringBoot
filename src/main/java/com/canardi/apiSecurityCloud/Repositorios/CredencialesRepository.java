package com.canardi.apiSecurityCloud.Repositorios;

import com.canardi.apiSecurityCloud.Modelos.CredencialesSecurityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CredencialesRepository extends JpaRepository<CredencialesSecurityModel,Long> {

    Optional<CredencialesSecurityModel> findByUsuario(String usuario);

}

package com.canardi.apiSecurityCloud.Repositorios;

import com.canardi.apiSecurityCloud.Modelos.RolesSecurityModel;
import com.canardi.apiSecurityCloud.Utils.RolesNames;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface RolesRepository extends JpaRepository<RolesSecurityModel, Long> {

    Optional<RolesSecurityModel> findBynombreRol(RolesNames rolesNames);

}

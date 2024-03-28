package com.canardi.apiSecurityCloud.Repositorios;

import com.canardi.apiSecurityCloud.Modelos.RolesSecurityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<RolesSecurityModel, Long> {
}

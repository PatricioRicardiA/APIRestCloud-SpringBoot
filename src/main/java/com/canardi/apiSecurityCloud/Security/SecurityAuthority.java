package com.canardi.apiSecurityCloud.Security;

import com.canardi.apiSecurityCloud.Modelos.RolesSecurityModel;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

    private final RolesSecurityModel roles;

    @Override
    public String getAuthority() {
        return roles.getNombreRol().toString();
    }
}

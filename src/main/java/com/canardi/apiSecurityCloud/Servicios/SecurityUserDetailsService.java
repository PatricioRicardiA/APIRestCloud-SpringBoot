package com.canardi.apiSecurityCloud.Servicios;

import com.canardi.apiSecurityCloud.Repositorios.CredencialesRepository;
import com.canardi.apiSecurityCloud.Security.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserDetailsService implements UserDetailsService {

    private final CredencialesRepository credencialesRepository;

    public SecurityUserDetailsService(CredencialesRepository credencialesRepository) {
        this.credencialesRepository = credencialesRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        var optUser = this.credencialesRepository.findByUsuario(username);

        if(optUser.isPresent()){
            return new SecurityUser(optUser.get());
        }
            throw new UsernameNotFoundException("User not found");

    }
}

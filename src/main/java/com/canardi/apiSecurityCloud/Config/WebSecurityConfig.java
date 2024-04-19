package com.canardi.apiSecurityCloud.Config;

import com.canardi.apiSecurityCloud.Servicios.SecurityUserDetailsService;
import com.canardi.apiSecurityCloud.Servicios.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Autowired
    private SecurityUserDetailsService userDetailsService;

    /*
    @Bean
    public UserDetailsService userDetailsService(){
    var user = User.withUsername("pato").password("pato").roles("read").build();
    return new InMemoryUserDetailsManager(user);
    }
    */

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http.httpBasic().and().authorizeHttpRequests()
                .anyRequest().hasAuthority("WRITE")
                .and().build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}

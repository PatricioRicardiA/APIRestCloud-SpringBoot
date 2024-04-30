package com.canardi.apiSecurityCloud.Utils;

import com.canardi.apiSecurityCloud.Modelos.CredencialesSecurityModel;
import com.canardi.apiSecurityCloud.Modelos.RolesSecurityModel;
import com.canardi.apiSecurityCloud.Repositorios.CredencialesRepository;
import com.canardi.apiSecurityCloud.Repositorios.RolesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ListIterator;

@Component
public class Runner implements CommandLineRunner {

    private final CredencialesRepository credencialesRepository;
    private final RolesRepository rolesRepository;

    public Runner(CredencialesRepository credencialesRepository, RolesRepository rolesRepository) {
        this.credencialesRepository = credencialesRepository;
        this.rolesRepository = rolesRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        this.credencialesRepository.saveAll(List.of(
                new CredencialesSecurityModel("Lolo","457", List.of(this.rolesRepository.findBynombreRol(RolesNames.WRITE).get())),new CredencialesSecurityModel("Sebas","890", List.of(this.rolesRepository.findBynombreRol(RolesNames.READ).get())))
        );

        if (this.rolesRepository.count() == 0){
            this.rolesRepository.saveAll(List.of(
                    new RolesSecurityModel(RolesNames.ADMIN),
                    new RolesSecurityModel(RolesNames.READ),
                    new RolesSecurityModel(RolesNames.WRITE)
            ));
        }
        if(this.credencialesRepository.count() == 0){
            this.credencialesRepository.saveAll(List.of(
                    new CredencialesSecurityModel("Pato","123", List.of(this.rolesRepository.findBynombreRol(RolesNames.ADMIN).get())))
            );
        }
    }
}

package com.canardi.apiSecurityCloud.Modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Credenciales")
public class CredencialesSecurityModel {

    public CredencialesSecurityModel(String usuario, String contraseña, List<RolesSecurityModel> roles) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.roles = roles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usuario;
    private String contraseña;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Credenciales_Roles",
               joinColumns = @JoinColumn(name = "Credenciales_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "Roles_id",referencedColumnName = "id"))

    private List<RolesSecurityModel> roles;

}

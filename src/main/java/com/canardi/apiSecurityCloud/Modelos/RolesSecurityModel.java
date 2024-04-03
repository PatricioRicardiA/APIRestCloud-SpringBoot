package com.canardi.apiSecurityCloud.Modelos;

import com.canardi.apiSecurityCloud.Utils.RolesNames;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "Roles")
public class RolesSecurityModel {

    public RolesSecurityModel(RolesNames nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RolesNames nombreRol;

}

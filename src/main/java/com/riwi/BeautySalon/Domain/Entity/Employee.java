package com.riwi.BeautySalon.Domain.Entity;

import com.riwi.BeautySalon.Utils.enums.RoleEmployee;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String firstName;

    @Column(length = 100, nullable = false)
    private String lastName;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String phone;

    //los enumerados se manejan de tipo string
    @Enumerated(EnumType.STRING)
    private RoleEmployee role;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "service",
     fetch = FetchType.EAGER, cascade = CascadeType.ALL,
     orphanRemoval = false
     )
    private List<Appointment> appointment;
}

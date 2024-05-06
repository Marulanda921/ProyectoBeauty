package com.riwi.BeautySalon.Domain.Entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


//Getters
@Data

//constructor lleno
@AllArgsConstructor

//constructor vacio
@NoArgsConstructor

//para crear clases de manera mas limpia 
@Builder

//para que jpa la mapee
@Entity(name = "service")
public class ServiceEntity {

    //llave primaria
    @Id
    //tipo de generado
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //colocamos reglas 
    @Column(length = 100, nullable = false)
    private String name;

    @Lob//Declara el atributo como tipo text
    private String description;

    @Column(nullable = false)
    private BigDecimal price;



    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "service",
     fetch = FetchType.EAGER, cascade = CascadeType.ALL,
     orphanRemoval = false
     )
    private List<Appointment> appointment;
}

package com.riwi.BeautySalon.Domain.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity(name = "appointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    //Llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dateTime;

    @Column(nullable = false)
    private Integer duration;

    //mapea de tipo string a tipo texto
    @Lob
    private String comments;

    /*Relaciones */
    //Cita a Cliente

    @ManyToOne(fetch = FetchType.LAZY)

    //crear la llave foranea
    @JoinColumn(name = "client_id", referencedColumnName = "id")

    //todos los manytoOne tienen que tener una llave foranea ya que son debiles las tablas

    private ClientEntity client;

    /*Relacion entre apointment con service*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id", referencedColumnName = "id")
    private ServiceEntity service;


    /*Relacion entre apointment a empleado*/
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
}

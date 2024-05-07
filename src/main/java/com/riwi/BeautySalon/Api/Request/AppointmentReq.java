package com.riwi.BeautySalon.Api.Request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentReq {
    @NotBlank(message = "La fechay hora es requerida")
    private LocalDateTime dateTime;

    @Min(value = 10,message = "la duracion no puede ser menor a 10")
    @Max(value = 720, message = "La duracion no puede ser mayor a 11 horas")
    private Integer duration;

    private String comments;

    @NotNull(message = "el id del cliente es obligatorio ")
    private Long clientId;
    @NotNull(message = "el id del Servicio es obligatorio ")
    private Long serviceId;
    @NotNull(message = "el id del Empleado es obligatorio ")
    private Long employeeId;
}

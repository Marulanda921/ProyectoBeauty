package com.riwi.BeautySalon.Api.Request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceReq {
    @NotBlank(message = "el nombre del servicio es requerido.")
    private String name;
    private String description;
    @DecimalMin(value = "0.01", message = "El valor del servicio debe ser mayor")
    private BigDecimal price;
}

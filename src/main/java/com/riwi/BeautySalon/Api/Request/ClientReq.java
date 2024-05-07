package com.riwi.BeautySalon.Api.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientReq {
    @NotBlank(message = "El nombre es requerido")
    private  String firstName;
    @NotBlank(message = "El apellido es requerido")
    private  String lastName;

    @Size(min = 10, max = 20, message = "El telefono debe tener entre 10 y 20 caracteres")
    private  String phone;

    @Size(min = 5, max = 100, message = "El email debe tener entre 5 y 100 caracteres")
    @Email(message = "El no es valido")
    private  String email;
}

package com.riwi.BeautySalon.Api.Dto.Response;

//Esto es lo que quiero responder de cada entidad
//cuando alguien quiera consultar los servicios solo se veran los que esten aqui
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResp {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
}

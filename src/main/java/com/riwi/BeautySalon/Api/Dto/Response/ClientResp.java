package com.riwi.BeautySalon.Api.Dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientResp {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private List<AppoinmentToClient> appointment;
}

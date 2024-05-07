package com.riwi.BeautySalon.Api.Dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppoinmentToClient {
    private Long id;
    private LocalDateTime dateTime;
    private Integer duration;
    private String comments;
    //private BasicCLientResp client; se va el cliente
    private ServiceResp service;
    private EmployeeResp employee;
}

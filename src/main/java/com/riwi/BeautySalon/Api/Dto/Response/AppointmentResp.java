package com.riwi.BeautySalon.Api.Dto.Response;

import com.riwi.BeautySalon.Domain.Entity.ClientEntity;
import com.riwi.BeautySalon.Domain.Entity.ServiceEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentResp {
    private Long id;
    private LocalDateTime dateTime;
    private Integer duration;
    private String comments;
    private BasicCLientResp client;
    private ServiceResp service;
    private EmployeeResp employee;
}

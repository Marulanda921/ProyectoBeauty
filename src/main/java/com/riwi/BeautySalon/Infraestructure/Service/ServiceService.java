package com.riwi.BeautySalon.Infraestructure.Service;

import com.riwi.BeautySalon.Api.Dto.Response.ServiceResp;
import com.riwi.BeautySalon.Api.Request.ServiceReq;
import com.riwi.BeautySalon.Domain.Repository.ServiceRepository;
import com.riwi.BeautySalon.Infraestructure.AbstractService.IServiceServic;
import com.riwi.BeautySalon.Utils.enums.SortType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@AllArgsConstructor
@Transactional
public class ServiceService implements IServiceServic {

    @Autowired
    private final ServiceRepository serviceRepository;

    //IMPLEMENTACION DE HOY TRANSACTIONAL se va hacia atras y elimina lo que hizo


    @Override
    public ServiceResp create(ServiceReq request) {
        return null;
    }

    @Override
    public ServiceResp get(Long aLong) {
        return null;
    }

    @Override
    public ServiceResp update(ServiceReq request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<ServiceResp> getAll(int page, int size, SortType sortType) {
        if (page < 0) page = 0;
        PageRequest pagination = null;
        switch (sortType) {
            case NONE -> pagination = PageRequest.of(page, size);
            case ASC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).ascending());
            case DESC -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).descending());
        }
        this.serviceRepository.findAll(pagination).map();
        return null;
    }
    @Override
    public List<ServiceResp> search(String name) {
        return null;
    }
}

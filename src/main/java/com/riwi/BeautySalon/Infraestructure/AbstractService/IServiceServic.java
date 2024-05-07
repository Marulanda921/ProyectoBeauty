package com.riwi.BeautySalon.Infraestructure.AbstractService;

import com.riwi.BeautySalon.Api.Dto.Response.ServiceResp;
import com.riwi.BeautySalon.Api.Request.ServiceReq;

import java.util.List;

public interface IServiceServic extends CrudService<ServiceReq, ServiceResp, Long> {

  public List<ServiceResp>search(String name);

  public String FIELD_BY_SORT = "price";
}

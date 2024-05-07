package com.riwi.BeautySalon.Domain.Repository;

import com.riwi.BeautySalon.Domain.Entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity, Long> {
    @Query("SELECT s from serviceEntity s where s.price between :min and :max")
    public List<ServiceEntity> selectBeetweenPrice(BigDecimal min, BigDecimal max);


    @Query("SELECT s from service s where s.name like :search")
    public List<ServiceEntity> findByNameContains(String search);


}

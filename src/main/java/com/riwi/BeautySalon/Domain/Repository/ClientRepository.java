package com.riwi.BeautySalon.Domain.Repository;

import com.riwi.BeautySalon.Domain.Entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {

}

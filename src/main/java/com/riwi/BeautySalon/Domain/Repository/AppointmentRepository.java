package com.riwi.BeautySalon.Domain.Repository;

import com.riwi.BeautySalon.Domain.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository  extends JpaRepository<Appointment, Long> {

    @Query("select p from appointment p join fetch p.client c where c.id = :idClient")
    public Optional<Appointment> findByClientId(String idClient);

}

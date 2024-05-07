package com.riwi.BeautySalon.Domain.Repository;

import com.riwi.BeautySalon.Domain.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

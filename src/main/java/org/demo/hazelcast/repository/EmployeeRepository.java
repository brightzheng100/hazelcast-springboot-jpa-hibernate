package org.demo.hazelcast.repository;

import org.demo.hazelcast.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String>
{
}

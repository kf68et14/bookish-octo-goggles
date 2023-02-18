package com.vti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vti.entity.Department;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IDepartmentRepository extends JpaRepository<Department, Integer>, JpaSpecificationExecutor<Department> {
}

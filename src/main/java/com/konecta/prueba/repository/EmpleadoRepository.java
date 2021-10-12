package com.konecta.prueba.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konecta.prueba.entity.Empleado;

@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Serializable>{

	
}

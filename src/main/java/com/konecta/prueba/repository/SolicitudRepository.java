package com.konecta.prueba.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.konecta.prueba.entity.Solicitud;

@Repository("solicitudRepository")
public interface SolicitudRepository extends JpaRepository<Solicitud, Serializable>{

}

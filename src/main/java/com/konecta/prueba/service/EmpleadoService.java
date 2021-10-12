package com.konecta.prueba.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.konecta.prueba.entity.Empleado;
import com.konecta.prueba.entity.Solicitud;
import com.konecta.prueba.repository.EmpleadoRepository;
import com.konecta.prueba.repository.SolicitudRepository;

@RestController
@RequestMapping("/empleado")
@CrossOrigin
public class EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	SolicitudRepository solicitudRepository;
	
	@GetMapping(path = "/buscar")
	public List<Empleado> buscar(){
		return empleadoRepository.findAll();
	}
	
	@PostMapping(path = "/guardar")
	public Empleado guardar(@RequestBody Empleado empleado) {
		List<Solicitud> solicitud = empleado.getSolicitudList();
		empleado.setSolicitudList(null);
		empleadoRepository.save(empleado);
		for(Solicitud sol: solicitud) {
			sol.setId_empleado(empleado.getId());
		}
		solicitudRepository.saveAll(solicitud);
		empleado.setSolicitudList(solicitud);
		return empleado;
	}
	
	@DeleteMapping(path = "/eliminar/{id_empleado}")
	public void eliminar(@PathVariable ("id_empleado") Integer id_empleado) {
		Optional<Empleado> empleado = empleadoRepository.findById(id_empleado);
		if(empleado.isPresent()) {
			solicitudRepository.deleteAll(empleado.get().getSolicitudList());
			empleadoRepository.delete(empleado.get());
		}
	}
}

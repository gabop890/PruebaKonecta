package com.konecta.prueba.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3994990849496193957L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "fecha_ingreso")
	private Date fecha_ingreso;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "salario")
	private Integer salario;
	
	@OneToMany(mappedBy = "id_empleado")
	private List<Solicitud> solicitudList;

	public List<Solicitud> getSolicitudList() {
		return solicitudList;
	}

	public void setSolicitudList(List<Solicitud> solicitudList) {
		this.solicitudList = solicitudList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}
	
	
}

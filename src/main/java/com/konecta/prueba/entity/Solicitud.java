package com.konecta.prueba.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solicitud")
public class Solicitud implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2994212034409406481L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "resumen")
	private String resumen;
	
	@Column(name = "id_empleado")
	private Integer id_empleado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Integer getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(Integer id_empleado) {
		this.id_empleado = id_empleado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

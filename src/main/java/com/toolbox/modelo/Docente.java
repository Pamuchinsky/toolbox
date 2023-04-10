package com.toolbox.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="docente", uniqueConstraints = {@UniqueConstraint(name = "unique_email", columnNames= {"email"})})
public class Docente {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String nombre;
	
	@Column
	private String email;
	

	@Column
	private String password;
	

	@Column
	private String codigo;
	

	@Column
	private String estado;
	
	


	public Docente(Integer id, String nombre, String email, String password, String codigo, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.codigo = codigo;
		this.estado = estado;
	}


	public Docente() {
		super();
	}


	public Docente(String nombre, String email, String password, String codigo, String estado) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		this.codigo = codigo;
		this.estado = estado;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}



	
}

package com.toolbox.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String nombre;

	@Column
	private String categoria;

	@Column(length = 1000)
	private String seccion_a;

	@Column(length = 1000)
	private String seccion_b;

	@Column
	private String imagen;

	@Column
	private String link;

	public Articulo(Integer id, String nombre, String categoria, String seccion_a, String seccion_b, String imagen,
			String link) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.seccion_a = seccion_a;
		this.seccion_b = seccion_b;
		this.imagen = imagen;
		this.link = link;
	}

	public Articulo(String nombre, String categoria, String seccion_a, String seccion_b, String imagen, String link) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.seccion_a = seccion_a;
		this.seccion_b = seccion_b;
		this.imagen = imagen;
		this.link = link;
	}

	public Articulo() {

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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSeccion_a() {
		return seccion_a;
	}

	public void setSeccion_a(String seccion_a) {
		this.seccion_a = seccion_a;
	}

	public String getSeccion_b() {
		return seccion_b;
	}

	public void setSeccion_b(String seccion_b) {
		this.seccion_b = seccion_b;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}

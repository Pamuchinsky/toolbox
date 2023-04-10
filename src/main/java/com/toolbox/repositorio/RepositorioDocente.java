package com.toolbox.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.toolbox.modelo.Administrador;
import com.toolbox.modelo.Docente;



public interface RepositorioDocente extends CrudRepository<Docente, Integer> {

	public abstract Docente findByEmailAndPassword(String email, String password);
}

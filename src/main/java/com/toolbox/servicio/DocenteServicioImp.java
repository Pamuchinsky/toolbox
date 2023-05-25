package com.toolbox.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.toolbox.generico.GenericServiceImp;
import com.toolbox.modelo.Docente;
import com.toolbox.repositorio.RepositorioDocente;



@Service
public class DocenteServicioImp extends GenericServiceImp<Docente, Integer> implements DocenteServicio{

	@Autowired
	public RepositorioDocente repositorioDocente;
	
	@Override
	public CrudRepository<Docente, Integer> getDao(){
		return repositorioDocente;
	}
	
	@Override
	public Docente select(String email, String password) {
		return repositorioDocente.findByEmailAndPassword(email, password);
	}

}

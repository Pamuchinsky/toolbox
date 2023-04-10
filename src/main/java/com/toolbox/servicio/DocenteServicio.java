package com.toolbox.servicio;

import com.toolbox.generico.GenericService;
import com.toolbox.modelo.Administrador;
import com.toolbox.modelo.Docente;

public interface DocenteServicio extends GenericService<Docente, Integer>{

	public Docente select(String email, String password);
}


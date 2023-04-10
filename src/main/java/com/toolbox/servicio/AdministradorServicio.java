package com.toolbox.servicio;

import com.toolbox.generico.GenericService;
import com.toolbox.modelo.Administrador;
import com.toolbox.modelo.Docente;

public interface AdministradorServicio extends GenericService<Administrador, Integer>{

	public Administrador select(String email, String password);

}


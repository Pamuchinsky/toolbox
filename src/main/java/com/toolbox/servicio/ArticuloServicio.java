package com.toolbox.servicio;

import com.toolbox.generico.GenericService;
import com.toolbox.modelo.Articulo;

public interface ArticuloServicio extends GenericService<Articulo, Integer>{

	public Articulo select(String categoria, String nombre);

	public Articulo selectPorID(int id);
}


package com.app.negocio.curso;

import java.util.List;

import com.app.integracion.model.Curso;


public interface CursoServicio {

	public void insertar(Curso nuevo);
	public List<Curso> consultarTodos();
}

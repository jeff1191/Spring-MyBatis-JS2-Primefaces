package com.app.integracion.mapper;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app.integracion.model.Profesor;

public interface DaoProfesor {
	@Transactional
	public List<Profesor> consultarTodos(); 
}

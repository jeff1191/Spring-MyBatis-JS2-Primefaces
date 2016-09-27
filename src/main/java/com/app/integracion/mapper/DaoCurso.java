package com.app.integracion.mapper;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.app.integracion.model.Curso;

public interface DaoCurso {
	@Transactional
	public void insertar(Curso nuevoCurso);
	@Transactional
	public List<Curso> consultarTodos();
}

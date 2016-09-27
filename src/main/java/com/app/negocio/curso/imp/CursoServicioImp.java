package com.app.negocio.curso.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.integracion.mapper.DaoCurso;
import com.app.integracion.model.Curso;
import com.app.negocio.curso.CursoServicio;

@Service("cursoServicio")
public class CursoServicioImp implements CursoServicio{
	    
	  @Autowired
	  private DaoCurso daoCurso;

	public void insertar(Curso nuevo) {
		daoCurso.insertar(nuevo);
	}

	public List<Curso> consultarTodos() {
		// TODO Auto-generated method stub	
		return daoCurso.consultarTodos();
	}
}

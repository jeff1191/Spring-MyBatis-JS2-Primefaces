package com.app.presentacion;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.app.integracion.model.Profesor;
import com.app.negocio.profesor.ProfesorServicio;

@ManagedBean
@SessionScoped
public class BeanProfesor implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty("#{profesorServicio}")
	private ProfesorServicio profesorServicio;
	
	
	public ProfesorServicio getProfesorServicio() {
		return profesorServicio;
	}

	public void setProfesorServicio(ProfesorServicio profesorServicio) {
		this.profesorServicio = profesorServicio;
	}

	public List<Profesor> consultarProfesores(){
		return profesorServicio.consultarTodos();
	}
	
}

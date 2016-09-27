package com.app.presentacion;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

import com.app.integracion.model.Curso;
import com.app.negocio.curso.CursoServicio;

import javax.annotation.PostConstruct;


@ManagedBean
@ViewScoped
public class BeanCurso implements Serializable{
	private static final long serialVersionUID = 920074389311801987L;

	@ManagedProperty("#{cursoServicio}")
	private CursoServicio cursoServicio;
	
	private Curso addCurso;
	private List<Curso> listadoCursos;
	
	@PostConstruct
	public void init(){
		listadoCursos=cursoServicio.consultarTodos();
		addCurso= new Curso();
	}

	public void setCursoServicio(CursoServicio cursoServicio) {
		this.cursoServicio = cursoServicio;
	}

	public void setListadoCursos(List<Curso> listadoCursos) {
		this.listadoCursos = listadoCursos;
	}

	public void setAddCurso(Curso addCurso) {
		this.addCurso = addCurso;
	}

	public CursoServicio getCursoServicio() {
		return cursoServicio;
	}

	public Curso getAddCurso() {
		return addCurso;
	}

	public List<Curso> getListadoCursos() {
		return listadoCursos;
	}

	public void insertarCurso(){		
		FacesContext context = FacesContext.getCurrentInstance();		
		context.addMessage(null, new FacesMessage("Creando...(" + addCurso.getTitulo()+")"));
		cursoServicio.insertar(addCurso);
	}
}
	
	

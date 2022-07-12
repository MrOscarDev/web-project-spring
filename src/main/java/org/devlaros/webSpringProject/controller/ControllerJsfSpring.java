/**
 * 
 */
package org.devlaros.webSpringProject.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.devlaros.webSpringProject.Service.PruebaService;

/**
 * @author DevLar
 *
 */
@ManagedBean
@ViewScoped
public class ControllerJsfSpring {

	private String datoEmpresa;
	private String datoEmpleado;
//	asi se declara un bean(objeto) con Spring
	@ManagedProperty("#{pruebaServiceImpl}")
	private PruebaService pruebaServiceImpl;// Es la manera correcta de declara un bean inyectado primero el interface y
											// depsues la impl

	@PostConstruct
	public void init() {
	String dato = this.pruebaServiceImpl.mostrarDatos();
	System.out.println(dato);
	this.datoEmpresa= dato;
	
	this.datoEmpleado =this.pruebaServiceImpl.mostrarEmpleado();
	System.out.println(datoEmpleado);

	}

//getters and setters

	public PruebaService getPruebaServiceImpl() {
		return pruebaServiceImpl;
	}

	public void setPruebaServiceImpl(PruebaService pruebaServiceImp) {
		pruebaServiceImpl = pruebaServiceImp;
	}

	/**
	 * @return the datoEmpresa
	 */
	public String getDatoEmpresa() {
		return datoEmpresa;
	}

	/**
	 * @param datoEmpresa the datoEmpresa to set
	 */
	public void setDatoEmpresa(String datoEmpresa) {
		this.datoEmpresa = datoEmpresa;
	}

	/**
	 * @return the datoEmpleado
	 */
	public String getDatoEmpleado() {
		return datoEmpleado;
	}

	/**
	 * @param datoEmpleado the datoEmpleado to set
	 */
	public void setDatoEmpleado(String datoEmpleado) {
		this.datoEmpleado = datoEmpleado;
	}

	
}

/**
 * 
 */
package org.devlaros.webSpringProject.dto;

import org.springframework.stereotype.Repository;

/**
 * @author DevLar
 *
 */
@Repository
public class EmpleadoDtoImpl implements EmpleadoDto {

//	Metodo que creo apra hacer la prueba de inyeccion de beans con spring
	@Override
	public String consultarNombre() {
		
		return "Oscar lara Patricio es el nombre del empleado PRUEBA";
	}

}

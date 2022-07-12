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

	@Override
	public String consultarNombre() {
		
		return "Oscar lara Patricio es el nombre del empleado PRUEBA";
	}

}

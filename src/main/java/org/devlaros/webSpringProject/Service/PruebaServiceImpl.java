/**
 * 
 */
package org.devlaros.webSpringProject.Service;

import org.devlaros.webSpringProject.dto.EmpleadoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author DevLar
 *
 */
@Service 
public class PruebaServiceImpl implements PruebaService {
	
	@Autowired
	private EmpleadoDto empleadoDtoImpl;

	@Override
	public String mostrarDatos() {
		String dato="Prueba de que se configuro correctamente Spring";
		
		return dato;
	}
	
	

	@Override
	public String mostrarEmpleado() {
		
		return empleadoDtoImpl.consultarNombre();
	}
	

}

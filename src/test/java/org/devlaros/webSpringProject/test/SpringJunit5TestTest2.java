/**
 * 
 */
package org.devlaros.webSpringProject.test;

import static org.junit.Assert.*;

import org.devlaros.webSpringProject.Service.PruebaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author DevLar
 *prueba de como trabajr con notaciones de spring en junit4
 *solo funciona con junit4 ya que on la versio 5 de Junit no
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:applicationContextTest.xml")
public class SpringJunit5TestTest2 {
	
//	De esta manera es como llmaria objetoa o clases de tipo Services o service impl para hacer sus pruebas
	@Autowired
	private PruebaService pruebaServiceImpl;

	@Test
	public void test() {
	assertNotNull(pruebaServiceImpl);
	System.out.println(this.pruebaServiceImpl.mostrarEmpleado());
	}

}

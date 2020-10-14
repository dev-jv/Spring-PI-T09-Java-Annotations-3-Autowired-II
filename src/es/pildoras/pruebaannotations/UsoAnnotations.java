package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] arg) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Sofia = contexto.getBean("comercialExp", Empleados.class);
	
		System.out.println(Sofia.getTareas());
		System.out.println(Sofia.getInforme());
		
		contexto.close();
	}
}

package co.com.App.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ias.model.Persona;
import co.com.ias.service.IPersonaService;

public class App {
	public static void main(String[] args) {
		/*
		Persona p = new Persona();
		p.setNombres("Johan");
		System.out.println("Nombre>>"+p.getNombres());
		*/
		//Patron de diseño facotria 
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
		Persona per = (Persona) context.getBean("persona");//toma el id del xml
		System.out.println(per.toString());
		
		IPersonaService service = (IPersonaService) context.getBean("PersonaServices");
		service.crear();
		
		
		((ConfigurableApplicationContext) context).close();
	}
}

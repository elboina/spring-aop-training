package fr.worldline.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.worldline.aop.configuration.SpringAOPConfiguration;
import fr.worldline.aop.model.Employe;
import fr.worldline.aop.model.EmployeService;

public class DemoAspect {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringAOPConfiguration.class);
		EmployeService employeService = (EmployeService) context.getBean("employeService");
		Employe employe = employeService.getEmployeById(1);
		System.out.println("Employe : " + employe.getFirstName() + " " + employe.getLastName());
		context.close();
	}

}

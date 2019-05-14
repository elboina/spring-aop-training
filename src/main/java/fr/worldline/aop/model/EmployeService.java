package fr.worldline.aop.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeService {
	
	public Employe getEmployeById(Integer id) {
		System.out.println("Method getEmployeById called");
		return new Employe();
	}
	
	public List<Employe> getAllEmploye() {
		System.out.println("Method getAllEmploye called");
		return new ArrayList<Employe>();
	}
	
	public void createEmploye(Employe employe) {
		System.out.println("Method createEmploye called");
	}
	
	public void updateEmploye(Employe employe) {
		System.out.println("Method update updateEmploye called");
	}
	
	public void deleteEmploye(Integer id) {
		System.out.println("Method deleteEmploye called");
	}

}

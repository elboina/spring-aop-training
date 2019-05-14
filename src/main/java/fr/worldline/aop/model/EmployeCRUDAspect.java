package fr.worldline.aop.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeCRUDAspect {
	
	@Before("execution(* EmployeService.getEmployeById(..))")
	public void logBeforeV1(JoinPoint joinPoint) {
		System.out.println("EmployeCRUDAspect.logBeforeV1 : " + joinPoint.getSignature().getName());
	}
	
	@Before("execution(* EmployeService.*(..))")
	public void logBeforeV2(JoinPoint joinPoint) {
		System.out.println("EmployeCRUDAspect.logBeforeV2 : " + joinPoint.getSignature().getName());
	}
	
	@Around("execution(* EmployeService.getEmployeById(..))")
	public Object employeAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		Employe emp = null;
		try {
			emp = (Employe) proceedingJoinPoint.proceed();
			emp.setFirstName("Norman");
			emp.setLastName("Smith");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Around ==> After invoking getName() method. Return value=" + emp);
		return emp;
	}
}

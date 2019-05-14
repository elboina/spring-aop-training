package fr.worldline.aop.model;

import org.aspectj.lang.JoinPoint;
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
}

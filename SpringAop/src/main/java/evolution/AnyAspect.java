package evolution;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnyAspect {
	@Before("execution(* evolution.AnyService.anyMethod())")
	public void beforeMethod(JoinPoint joinPoint) {
		System.out.println("Before method has been called.");
	}
	
	@After("execution(* evolution.AnyService.anyMethod())")
	public void afterMethod(JoinPoint joinPoint) {
		System.out.println("After method has been called.");
	}
	
	@Around("execution(* evolution.AnyService.anyMethod())")
	public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("Around method has been called.");
		proceedingJoinPoint.proceed();
	}
}

package sp.com.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LoggingAspects implements  MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-genera"Servicted method stub
		System.out.println("Service Logic for Login");
		
	}

}

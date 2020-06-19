package com.enjoy.cap10.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

//日志切面类
@Aspect
public class LogAspects {
	@Pointcut("execution(public int com.enjoy.cap10.aop.Calculator.*(..))")
	public void pointCut1(){};
	
	//@before代表在目标方法执行前切入, 并指定在哪个方法前切入
	@Before("pointCut1()")
	public void logStart(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName()+"除法运行..Before..参数列表是:{"+Arrays.asList(joinPoint.getArgs())+"}");
	}
	@After("pointCut1()")
	public void logEnd(JoinPoint joinPoint){
		System.out.println(joinPoint.getSignature().getName()+"除法结束...After...");
		
	}
	@AfterReturning(value="pointCut1()",returning="result")
	public void logReturn(Object result){
		System.out.println("AfterReturning除法正常返回......运行结果是:{"+result+"}");
	}
	@AfterThrowing(value="pointCut1()",throwing="exception")
	public void logException(Exception exception){
		System.out.println("AfterThrowing运行异常......异常信息是:{"+exception+"}");
	}
	
//	@Around("pointCut1()")
//	public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//		System.out.println("@Arount:执行目标方法之前...");
//		Object obj = proceedingJoinPoint.proceed();//相当于开始调div地
//		System.out.println("@Arount:执行目标方法之后...");
//		return obj;
//	}
}

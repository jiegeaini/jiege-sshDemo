package com.ssh.ascept;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @title ������
 * @function ������ӡҵ�񷽷�ִ��
 * @author jiege
 *
 */
public class UserAscept {
   public Object log(ProceedingJoinPoint joinPoint)throws Throwable {
	   System.out.println("start--->"+joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		System.out.println("end---->"+joinPoint.getSignature().getName());
		return object;
	   
   }
}

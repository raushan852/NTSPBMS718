package com.rk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rk.sbeans.WishMessageGenerator;

public class DependencyInjectionTest 
{
	public static void main(String[] args)
	{
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/rk/cfgs/applicationContext.xml");
		
		Object obj= ctx.getBean("wmg");
		
		WishMessageGenerator generator= (WishMessageGenerator)obj;
		
		String result= generator.showWishMessage("Raushan");
		
		System.out.println(result);
		
		ctx.close();
	}
}

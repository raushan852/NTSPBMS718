package com.rk.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.rk.sbeans.SeasonFinder;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		FileSystemXmlApplicationContext ctx= 
				new FileSystemXmlApplicationContext("src/com/rk/cfgs/applicationContext.xml");
		
		Object obj= ctx.getBean("sf");
		
		SeasonFinder generator= (SeasonFinder)obj;
		
		String result = generator.showSeason();
		
		System.out.println(result);
		
		ctx.close();
	}

}

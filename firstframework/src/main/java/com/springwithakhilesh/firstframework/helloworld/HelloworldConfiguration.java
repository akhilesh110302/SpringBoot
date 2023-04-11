package com.springwithakhilesh.firstframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name,int age,Address add) {};
record Address(String state , String city) {};
@Configuration
public class HelloworldConfiguration 
{
	@Bean
	public String name()
	{
		return "Akhilesh";
	}
	@Bean
	public int age()
	{
		return 16;
	}
	@Bean	
	@Primary
	public Person person()
	{
		var person= new Person("Akhilesh",21,new Address("Gujarat","ahm"));
		
		return person;
	}
	
	@Bean

	public Person person4Qualifefr(String name ,int age, @Qualifier("add11") Address add1)
	{
		 
		
		return new Person(name,age,add1);
	}

	@Bean

	public Person personwithnameandage()
	{
		return new Person(name(),age(), add1());
		
		 
	}
	
	@Bean

	public Address add1()
	{
		var ad= new Address("Gujarat","mp");
		return ad;
	}
	
	@Bean
	@Qualifier("add11")
	@Primary
	public Address add2(String state, String city,  Address add1)
	{
		var ad= new Address("Gujarat","bombayu");
		return ad;
	}
	
	@Bean(name="ad")
	public Address add3()
	{
		var ad= new Address("Gujarat","gujjjjj");
		return ad;
	}
}

package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record Released in JDK 16.
// getter, setter 쓸 필요가 없어짐.
record Person (String name, int age, Address address) {}

record Address(String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Yunz";
	}
	
	@Bean
	public int age() {
		return 31;
	}
	
	@Bean
	public Person person() {
		return new Person("Joni", 32, new Address("yangcheon-gu", "Seoul"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {	
		// name, age, address2
		return new Person(name, age, address2);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {	
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {	
		return new Person(name, age, address);
	}
	
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("Geumcheon-gu", "Seoul");
	}
	
	@Bean(name="address3")
	@Qualifier("address3qualifier")
	public Address address2() {
		return new Address("Gwangjin-gu", "Seoul");
	}
}

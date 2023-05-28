package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo1Application.class, args);

		List<String> cities = new ArrayList<String>();
		cities.add("New York");
		cities.add("London");
		cities.add("Tokyo");
		cities.add("Cairo");

		System.out.println("---imprimir utilizando for()---");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println("ciudad: " + cities.get(i));
		}

		System.out.println("---imprimir utilizando forEach()---");
		System.out.println("----con lamda----");
		cities.stream().forEach(city -> System.out.println(city));
		System.out.println("----con referencia ametodo----");
		cities.stream().forEach(System.out::println);
		//cities.forEach(Main::printCty); //referencia al metodo local
		System.out.println("----Con parallet----");
		cities.stream().parallel().forEach(System.out::println);

	}

	// Metodo para utilizar metodos directos ::
	public static void printCty(String city) {
		System.out.println(city);
	}

}

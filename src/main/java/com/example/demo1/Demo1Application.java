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
		cities.add("Catemu");

		System.out.println("---imprimir utilizando for()---");
		for (int i = 0; i < cities.size(); i++) {
			System.out.println("ciudad: " + cities.get(i));
		}

		/*
		 * el ptatron de diseño pipeline permite procesar el elemnto y devolverlo para
		 * que se pueda seguir procesando
		 * para utilizazar las funciones pipeline se puede anteponer stream()
		 */
		System.out.println("---imprimir utilizando forEach()---");
		System.out.println("----con lamda----");
		cities.stream().forEach(city -> System.out.println(city));
		System.out.println("----con referencia ametodo----");
		cities.stream().forEach(System.out::println);
		// cities.forEach(Main::printCty); //referencia al metodo local
		System.out.println("----Con parallet----"); // los procesa por bloque, de esta forma no itera los elementos en
													// orden
		cities.stream().parallel().forEach(System.out::println); // desde stream()
		System.out.println("----pipeline Filtro----");
		cities.stream().filter(city -> city.toLowerCase().startsWith("c")).forEach(System.out::println);

	}

	// Metodo para utilizar metodos directos ::
	public static void printCty(String city) {
		System.out.println(city);
	}

}

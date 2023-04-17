package Ej4;

import java.util.HashSet;

public class Ej4_HashSet {

	public static void main(String[] args) {
		HashSet<String> empleados_carrefour=new HashSet<>();
		
		empleados_carrefour.add("Paco Gonzalez");
		empleados_carrefour.add("Maria Navarro");
		empleados_carrefour.add("Cristina Martinez");
		empleados_carrefour.add("Maria Navarro");//duplicado, no se agrega
		
		System.out.println(empleados_carrefour);
		

	}

}

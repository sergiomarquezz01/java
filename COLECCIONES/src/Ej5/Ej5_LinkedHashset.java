package Ej5;
import java.util.LinkedHashSet;
	

public class Ej5_LinkedHashset {

	   public static void main(String[] args) {
	      LinkedHashSet<String> libros = new LinkedHashSet<>();

	      // Agregar elementos al LinkedHashSet
	      libros.add("El Quijote");
	      libros.add("La Divina Comedia");
	      libros.add("El Señor de los Anillos");
	      libros.add("Don Juan Tenorio");

	      // Imprimir los elementos del LinkedHashSet
	      System.out.println(libros);
	   }
}
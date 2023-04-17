package Ej6;

import java.util.LinkedList;
import java.util.Queue;

public class Ej6_Queue {
	public static void main(String[] args) {
	   // crear una cola
	      Queue<String> equipos = new LinkedList<>();
	      
	   // agregar elementos a la cola
	      equipos.add("Real Madrid");
	      equipos.add("Barcelona");
	      equipos.add("Atletico de Madrid");
	      System.out.println("Los equipos son" +equipos);
	      
	   //obtener el primer elmento de la cola
	      
	      String primerElemento=equipos.peek();
	      System.out.println("el primer equipo es: "+primerElemento);
	      
	   //eliminar cualquier elemento de la cola
	      
	      String quitarElemento=equipos.remove();
	      System.out.println("el equipo que ha sido eliminado es: " +quitarElemento);
	      
	   //mostrar todos los elementos de la cola
	      
	      System.out.println("los equipos de ahora son:  "+ equipos);

	}
}
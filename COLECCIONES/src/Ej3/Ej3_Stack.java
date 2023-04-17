package Ej3;

import java.util.Stack;

public class Ej3_Stack {
	public static void main(String[]args)
	{
		//crear una pila
		Stack<String> pilotos=new Stack<>();
		
		//agregar pilotos a la pila
		
		pilotos.push("Fernando Alonso");
		pilotos.push("Sergio Perez");
		pilotos.push("Carlos Sainz");
		
		//obtener el piloto superior de la pila
		
		String pilotoSuperior=pilotos.peek();
		System.out.println("El piloto superior es(peek)" +pilotoSuperior);
		
		//eliminar un piloto de la pila
        String pilotoEliminado = pilotos.pop();
        System.out.println("El piloto eliminado es: (pop) " + pilotoEliminado);
        
        // Mostrar todos los pilotos de la pila
        System.out.println("Los pilotos restantes son:");
        while (!pilotos.empty()) {
            String piloto = pilotos.pop();
            System.out.println(" - " + piloto);
        }
    }
}

	
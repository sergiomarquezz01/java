package Ej2;

import java.util.LinkedHashMap;

public class Ej2_LinledHashMap {
	public static void main(String[]args) {
		//creamos un nuevo objeto LinkedHashMap
		LinkedHashMap<String, String> linkedHashMap=new LinkedHashMap<>();
		
		//agregamos pares clave-valor
		linkedHashMap.put("Nombre","Malaga");
		linkedHashMap.put("Pais", "España");
		linkedHashMap.put("Poblacion","650000");
		linkedHashMap.put("Lugares","La Catedral, La Alcazaba,El pimpi,Calle Larios");
	
		//recorremos el linkedHashMap e imprimos todos los alores
		   for (String key : linkedHashMap.keySet()) {
	            String value = linkedHashMap.get(key);
	            System.out.println(key + ": " + value);
	        }
	    }
	}
	

package Ej1;
import java.util.HashMap;

public class Ej1_HashMap {
	public static void main(String[]args)
	{
		HashMap<String,String> direcciones= new HashMap<>();
		
		direcciones.put("Malaga","Calle Roger de Flor");
		direcciones.put("Sevilla","Calle Feria ");
		direcciones.put("Madrid", "Paseo de la Castellana");
		
		String direccion=direcciones.get("Malaga");
		System.out.println("La calle de este centro es " +direccion);
		
		for(String key:direcciones.keySet())
		{
			String value=direcciones.get(key);
			System.out.println(key + " ->" + value);
		}
	}

}

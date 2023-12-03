import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		//Chequea los valores multiplos de 2 del arreglo
		 for(int i=0; i<arr2.length; i++)
			 if (arr2[i] % 2 == 0)
			 {
				 System.out.println(arr2[i]);
				 break; //sale del ciclo cuando se cumple el objetivo
			 }
			 else
			 {
				 System.out.println(arr2[i] +" is not multiple of 2");
			 }
		 

		 //ArrayList es una clase de java para arreglo dinamico, a es un objeto tipo ArrayList
		 List<String> a = new ArrayList<String>(); //create String object of the class - object.methods
		 a.add("yoisy");//a.add inserta valor a la lista a
		 a.add("perez");
		 a.add("olmos");
		 System.out.println(a.get(2)); //a.get acceso al elemento ubicado en la posicion 2 de la lista
		 
		 System.out.println("*************");
		 
		 for(int i = 0; i<a.size(); i++) //a.size acceso al tamano de la lista
		 {
			 System.out.println(a.get(i)); 
		 }

		 System.out.println("*************");
		 
		 for (String val:a) //Sintaxis optimizada para el for en una lilsta, val almacena cada elemento tipo string de la lista a
		 {
			 System.out.println(val);
		 }
		 
		 //item is present in ArrayList
		 System.out.println(a.contains("yoisy")); //Verifica si la lista contiene al elemento "yoisy", devuelve booleano
		 
		 String[] name = {"yoisy", "perez", "olmos"};//Convertir el arreglo name en una lista, nameArrayList, de los mismos valores
		 List<String> nameArrayList = Arrays.asList(name);
		 nameArrayList.contains("yoisy");
	}

}

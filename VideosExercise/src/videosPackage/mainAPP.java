package videosPackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainAPP extends User {

	public static void main(String[] args) {
		
		List<User> usuario = new ArrayList<User>();
		
		//main menu: display menu y retorno opcion (int)
		int OptionMainMenu=mainMenu();
				
		
		//verifico el valor retornado con try catch o throw exception y obtengo valor filtrado (int)
		
		
		// Switch case para cada opcion devuelta
		
		System.out.println(OptionMainMenu);
		
		
		
		switch(OptionMainMenu)
	     {
	        case 1:
	        	//"CreateNewUser"
	        	System.out.println("\nCreate...");        	
	        	break;
	        case 2:
	        	//"logIn"
	        	System.out.println("\nlogIn...");
	    		//addNewUserMenu
	        	

	        	break;
	        case 3:
	        	//"exit"
	        	System.out.println("\nExit...");
	        	break;
	      }
		
		
		
	
		//soltar la pantalla de menu
		
		
		//entrada de datos
		
				
		//cargar nombre y apellido aqui
		
		
		
		// Setear password con verificacion, 
		// funcion en user y que devuelva un boolean de ok, sino repito ciclo
		
		//    fijarse que onda con el throw y throws o try catch "si no es letra que pasa?" 
		
		//  si password ok, paso a crear el momento de registro
		
		
		//  seteo el momento de registro aca, me fijo la forma de guardar el dato, 
		//   ver en q tipo de dato esta para llevarlo y leerlo de alguna fomrma alla
		
				
		// seteo el espacio de memoria en lista del objeto user1 en la posicion cero, hay una forma mas cheta?
		
		
		
		// me fijo cual sera el menu q ingresa una vez registrado y que opciones debe tener
		
		//  opcion agregar videos
		//  opcion ver lista de videos
		
		
		// me fijo de que forma se pregunta si quiere agregar videos o ver los que ya tiene
		
		
	}
	
	/*

	
		*/
		
	

}

	

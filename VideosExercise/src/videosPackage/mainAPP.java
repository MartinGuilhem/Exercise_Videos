package videosPackage;

import java.time.LocalDateTime;
import java.util.Scanner;

public class mainAPP extends User {

	public static void main(String[] args) {
		
		
		//main menu: display menu y retorno opcion (int)
		int OptionMainMenu=mainMenu();
				
		
		//verifico el valor retornado con try catch o throw exception
		// obtengo valor filtrado (int)
		
		
		// Switch case para cada opcion devuelta
		
		switch(OptionMainMenu)
	     {
	        case 1:
	        	//CreateNewUser
	        case 2:
	        	//logIn
	        case 3:
	        	//exit
	      }
		
		
		//addNewUserMenu
	
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
	
	public static int mainMenu()
	{
		Scanner sc = new Scanner(System.in);
		int option=0;

		System.out.println("Welcome to VideoApp");
		System.out.println("Choose an option: ");
		System.out.println("1. Create New User");
		System.out.println("2. LogIn");
		System.out.println("3. Exit");
		option=sc.nextInt();
		
		return option;		
	}
	
	public static void createNewUser() {
		Scanner sc = new Scanner(System.in);
		//creo una lista de usuarios
		List<User> usuario = new ArrayList<User>();

		System.out.println("Create New User");
		System.out.println("Name: ");
		String name=sc.nextLine();
		System.out.println("Surname: ");
		String surname=sc.nextLine();
		
		do {
			System.out.println("Password: ");
			String password=sc.nextLine();
			System.out.println("Repeat Password: ");
			String repassword=sc.nextLine();
			
			if(!password.equals(repassword)) {
				System.out.println("Passwords must be equals, Please Repeat: ");
			}
		}while(!password.equals(repassword));
		
		String regDate=getDate();
		
		
		
		
	}
		
		
	

}

	

package videosPackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainAPP extends User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<User> user = new ArrayList<User>();
				
		//main menu: display menu y retorno opcion (int)
		int OptionMainMenu, ask;
						
		
		
		do {
			OptionMainMenu=mainMenu();					
			switch(OptionMainMenu)
			{
	        	case 1:
	        		user.add(createNewUser());
	        		break;
	        	case 2:
	        		//"logIn"
	        		System.out.println("\nlogIn...");
	        		//addNewUserMenu
	        		break;
	        	case 3:
	        		//"Show User list"
	        		System.out.println("\nExit...");
	        		break;
	        	case 4:
	        		//"exit"
	        		System.out.println("\nExit...");
	        		break;	        			        			
			}
						
			System.out.println("\n\tPress '1' to continue operating.\n");
			ask=Integer.parseInt(sc.nextLine());
						
		}while(ask==1);
			
				
	}
	
	/*
	System.out.println("Lista de usuarios:\n");
	
	for(User usr: user)
	{
		System.out.println(user.toString());
	}
	*/
	
	public static User createNewUser() {
		Scanner sc = new Scanner(System.in);
		String password, repassword;
				
		System.out.println("Create New User...");
		System.out.println("Name: ");
		String name=sc.nextLine();
		System.out.println("Surname: ");
		String surname=sc.nextLine();
		
		do {
			System.out.println("Password: ");
			password=sc.nextLine();
			System.out.println("Repeat Password: ");
			repassword=sc.nextLine();
			
			if(!password.equals(repassword)) {
				System.out.println("Passwords must be equals, Please Repeat: ");
			}
			else {
				System.out.println("\nUser Created! \n");
			}
		}while(!password.equals(repassword));
		
		String regDate = getDate();
		
		User aux= new User(name, surname, password, regDate);
		
		return aux;
	}
	
}
		




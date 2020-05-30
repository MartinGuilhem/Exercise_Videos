package videosPackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainAPP extends User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<User> user = new ArrayList<User>();
				
		
		int OptionMainMenu, ask, iuser;
						
		do {
			OptionMainMenu=mainMenu();					
			switch(OptionMainMenu)
			{
	        	case 1:
	        		user.add(createNewUser());
	        		break;
	        	case 2:
	        		iuser=logIn(user);
	        		System.out.println(iuser+ "es la posicion del usuario en la lista");
	        		//lo proximo sera ingresar al menu dentro del login con iuser para modificar lo q sea de esa posicion de memoria dentro del login
	        		break;
	        	case 3:
	        		System.out.println("\nShow User List...");
	        		showUserList(user);
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
	
	

	
	
//	funcion: lee datos y retorna objeto user listo para agregar a la lista usuario en el main
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
	
//	LOGIN MENU
//	mando la lista, pido datos, los comparo y si pertenece devuelvo la posicion en la lista (int), sino,(-1) 
	public static int logIn(List<User> user) {
		Scanner sc = new Scanner(System.in);
		String name, surname, password;
		int aux=-1;
		
		do {
			System.out.println("Login MENU...");
			System.out.println("Name: ");
			name=sc.nextLine();
			System.out.println("Password: ");
			password=sc.nextLine();
		
			for(int i=0; i<user.size(); i++) {
			
				if(equals(name, password, user.get(i)))
				{
					aux=i;
				}
			}
		
			if(aux==-1)
			{
				System.out.println("\n Username or Password is incorrect please input again...");
			}

		}while(aux==-1);
		
		return aux;
	}
	
	
	public static boolean equals(String name, String pass, User a){
		 
        if(a.getName().equals(name) && a.getPass().equals(pass)){
            return true;
        }else{
            return false;
        }
    }
	
	
	public static void showUserList(List<User> user) {
		
		System.out.println("Lista de nombres de usuarios:\n");
	
		for(int i=0; i<user.size(); i++)
		{
			System.out.println(user.get(i).toString());
			System.out.println("-----------------------------------------------");
		}
		
	}
	
	

}

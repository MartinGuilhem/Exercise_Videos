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
	        		System.out.println(iuser+ " es la posicion del usuario en la lista");
	        		//funcion menu login con el objeto. modificar objeto dentro del login
	        		userMenu(user.get(iuser));
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
	
	
	public static void userMenu(User user)
	{
		Scanner sc = new Scanner(System.in);		
		int option=0, ask;
		
		
		System.out.println("\nWelcome "+user.getName()+" what do you want to do?");
		
		do {
			option=userMenu();
					
			switch(option)
			{
				case 1:
					//addNewVideo
					user.setNewVideo(addNewVideo());
					break;
				case 2:
					showVideoList(user);
					break;
				case 3:
					//deleteVideoFromList
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

	
	public static Video addNewVideo() {
		Scanner sc = new Scanner(System.in);
		String URL, title;
//		char askNewTag;
		List<String> tags = new ArrayList<>();
		
		
		System.out.println("Add New Video...");
		System.out.println("Video Title: ");
		title=sc.nextLine();
		System.out.println("URL: ");
		URL=sc.nextLine();
								
//		do {
//			System.out.println("Do you want to add a new Tagg? (y/n)");
//			askNewTag=sc.next().charAt(0);
//				
//			if(askNewTag=='y')
//			{
//				addNewTag()
//			}
//			
//		}while(askNewTag=='y');
//		
		
		Video aux= new Video(URL, title, tags);
		
		return aux;
	}
	
	
	public static void showVideoList(User user) {
		
		System.out.println("Video list:\n");
		
		for(int i=0; i<user.getVideoList().size(); i++)
		{
			System.out.println("-----------------------------------------------");
			System.out.println("TITLE:");
			System.out.println("\t"+user.getVideoList().get(i).getTitle());
			System.out.println("URL:");
			System.out.println("\t"+user.getVideoList().get(i).getURL());
		}
		
	}
			

//	public static String addNewTag(User user) {
//		
//		Scanner sc = new Scanner(System.in);
//		String tag;
//		boolean exist=false;
//		
//		
//		System.out.println("Enter New Tag: ");
//		tag=sc.nextLine();
//		
//		for(int i=0; i<user.; i++) {
//			if(tag.compareToIgnoreCase(tags.get(i)))
//			{
//				System.out.println("The Tag you entered allready exists");
//				exist=true;
//			}
//		}
//		if(exist==false) 
//		{
//			tags.add(tag);
//		}
//		
//	}
	
}

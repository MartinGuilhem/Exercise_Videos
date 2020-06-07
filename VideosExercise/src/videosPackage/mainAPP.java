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
					user.setNewVideo(addNewVideo());
					break;
				case 2:
					showVideoList(user);
					break;
				case 3:
					deleteVideo(user);
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
	
	
	public static void deleteVideo(User user) {
		Scanner sc = new Scanner(System.in);		
		int num=-1;
		
		do {

			System.out.println("\n Select # video you want to delete.. ");
			for(int i=0; i<user.getVideoList().size(); i++)
			{
				System.out.println("-----------------------------------------------");
				System.out.println("TITLE:");
				System.out.println("\t"+(i+1)+"- "+user.getVideoList().get(i).getTitle());
			}
			System.out.println("\n Select # video you want to delete.. ");
			num=Integer.parseInt(sc.nextLine());
			
			if(num==-1) {
				System.out.println("Error, you must put a correct option... please try again!");
			}
			 
		}while(num==-1);
		
		user.getVideoList().remove(num-1);
		
	}
	
	
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
	
	
	public static Video addNewVideo() {
		Scanner sc = new Scanner(System.in);
		String URL="", title="", tag="", auxi="";
		char askNewTag;
		Video aux= new Video(URL, title);
		
		
		System.out.println("Add New Video...");
		System.out.println("Video Title: ");
		title=sc.nextLine();
		aux.setTitle(title);
		System.out.println("URL: ");
		URL=sc.nextLine();
		aux.setURL(URL);
										
		do {
			System.out.println("Do you want to add a new Tagg? (y/n)");
			askNewTag=sc.next().charAt(0);
			auxi=sc.nextLine();	
			if(askNewTag=='y')
			{
				System.out.println("Tag: ");
				tag=sc.nextLine();
				aux.setTag(tag);
			}
			
		}while(askNewTag=='y');
				
				
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
			System.out.println("TAGS:");
			
			for(int j=0; j<user.getVideoList().get(i).getTagList().size(); j++)
			{
				System.out.println("\t"+user.getVideoList().get(i).getTagList().get(j));
			}
		}
		
	}
			
	
}

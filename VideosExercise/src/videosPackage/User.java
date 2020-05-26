package videosPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
import java.time.*;



public class User {
	
		//properties
		private String name;
		private String surname;
		private String password;
		private String regDate;
		List <Video> videoList = new ArrayList <Video>();

				
		//User constructor con 4 parametros
		public User(String name, String surname, String password, String regDate) 
		{
			this.name=name;
			this.surname=surname;
			this.password=password;
			this.regDate=regDate;
			List <Video> videoList = new ArrayList <Video>();  //se inicializa la lista de videos en el constructor?
		}
		
			
		public static String getDate()
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			 
			return dtf.format(now);
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
		
		
		
		// como devuelvo una lista con el usuario creado?
		
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

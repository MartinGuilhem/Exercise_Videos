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
			List <Video> videoList = new ArrayList <Video>();  //dar parametros por defecto y luego agrego con setter		
		}
			
		
		public String getName()
		{
			return name;
		}
		
		
		public String getSurname()
		{
			return surname;
		}
		
		
		public String getPass()
		{
			return password;
		}
		
		
		public void setNewVideo(Video vid) {
			this.videoList.add(vid);
		}
		
		public List<Video> getVideoList(){			
			return videoList;
		}
		
		
//		retorna el regDate
		public static String getDate()
		{
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			 
			return dtf.format(now);
		}
		
		
//		menu principal, retorna valor opcion
		public static int mainMenu()
		{
			Scanner sc = new Scanner(System.in);
			int option=0;
			
			do {
				
				System.out.println("Welcome to VideoApp");
				System.out.println("Choose an option: ");
				System.out.println("1. Create New User");
				System.out.println("2. LogIn");
				System.out.println("3. Show User List");
				System.out.println("4. Exit");
				option=sc.nextInt();
				
				if(option!=1 && option!=2 && option!=3 && option!=4)
				{
					System.out.println("\n You must put a correct option... please try again\n");
				}
				
			}while(option!=1 && option!=2 && option!=3 && option!=4);
			
			return option;		
		}
		
		
		public String toString(){
	        return "User Data: \n" +
	                "\tName: "+name+"\n" +
	                "\tSurname: "+surname+"\n" +
	                "\tRegistration Date: "+regDate;
	    }
		
		
		public static int userMenu()
		{
			Scanner sc = new Scanner(System.in);
			int option=0;
			
			do {
								
				System.out.println("Choose an option: ");
				System.out.println("1. Add New Video");
				System.out.println("2. Show Video List");
				System.out.println("3. Delete Video From List");
				System.out.println("4. Exit");
				option=sc.nextInt();
				
				if(option!=1 && option!=2 && option!=3 && option!=4)
				{
					System.out.println("\n You must put a correct option... please try again\n");
				}
				
			}while(option!=1 && option!=2 && option!=3 && option!=4);
			
			return option;		
		}
				

		
}

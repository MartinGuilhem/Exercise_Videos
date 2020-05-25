package videosPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.time.*;



public class User {
	
		//properties
		private String name;
		private String surname;
		private String password;
		private String regDate;
		List <Video> videoList = new ArrayList <Video>();

				
		//User constructor
		public User() 
		{
			this.name="";
			this.surname="";
			this.password="";
			this.regDate="";
			//se inicializa la lista de videos en el constructor?
		}
		
		
		public void setNewUser(String name, String surname, String password, String regDate) {
			
			this.name=name;
			this.surname=surname;
			this.password=password; 
			this.regDate=regDate;
			//le traigo la lista de videos?
		}
		
		public static String getDate()
		{
			System.out.println("add date somehow, I think is automatic");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			 
			return dtf.format(now);
		}
		

		
}

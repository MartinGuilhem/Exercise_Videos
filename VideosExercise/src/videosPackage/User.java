package videosPackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class User {
	
		//properties
		private String name;
		private String surname;
		private String password;
		List <Video> videoList = new ArrayList <Video>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime regDate;
		
		
		//User constructor             // videos cannor be resolved to a type !?
		public User(String name, String surname, String password, List<Videos> video, LocalDateTime now)
		{
			this.name=name;
			this.surname=surname;
			this.password=password;
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			this.regDate = now;
			
		} 
				
		
} 
		
		

	
	
}

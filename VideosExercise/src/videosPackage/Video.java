package videosPackage;

import Exercise_Videos.ArrayList;
import Exercise_Videos.List;
import java.util.*;

public class Video {
	
	//properties
		private String URL;
		private String title;
		List<String> tags = new ArrayList<>();
		
		//builder
		public Video(String URL, String title, List<String> tag)
		{
			this.URL=URL;
			this.title=title;
			this.tags=tag; // si paso más de un tag como los traigo? 
						   //  puedo agregar datos a la lista de tags desde otra funcion !?
		}
		
		
		public String getURL() {
			return URL;
		}
		
		public String getTitle() {
			return title;
		}
		
		
		
		

}

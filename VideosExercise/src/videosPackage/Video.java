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
			this.tags=tag; // quiero que se agreguen datos, no q se reemplacen !?
		}

}

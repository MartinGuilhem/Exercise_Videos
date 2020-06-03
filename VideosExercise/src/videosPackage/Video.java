package videosPackage;

import Exercise_Videos.ArrayList;
import Exercise_Videos.List;
import java.util.*;

public class Video {
	
	//properties
		private String URL;
		private String title;
		private List<String> tagList = new ArrayList<>();
		
		List<String> tagList2 = new ArrayList<>();
		
		
		//builder
		public Video(String URL, String title){
			this.URL=URL;
			this.title=title;
			this.tagList=tagList2; 
		}
		
		
		public void setTitle(String title) {
			this.title=title;
		}
		
		public void setURL(String URL) {
			this.URL=URL;
		}
		
		public String getURL() {
			return URL;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTag(String tag) {
			this.tagList.add(tag);
		}
		
		public List<String> getTagList(){
			return tagList;
		}
		

}

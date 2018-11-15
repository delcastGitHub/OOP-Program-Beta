/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Driver.java
 * Description  : It demostrates that any class that implements the MultimediaControl interface would be able to be
 * 				  instantiated and use its methods used no matter if it was an audio or movie player
 */

package oopprogrambeta;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Driver {

	public static void print(List<Product> list) {
		
		for(Product prod:list) {
			System.out.println("\n"+prod);
		}
	}
		
	public static void main(String[] args) {	
		
		ArrayList<Product> list=new ArrayList<Product>();
		
		list.add(new AudioPlayer("audi player 3", "audio specification 3"));
	    list.add(new MoviePlayer("movie player 3"));
	      
	    list.add(new AudioPlayer("audio player 2", "audio specification 2"));
	    list.add(new MoviePlayer("movie player 2", new Screen("1024x768", 99,11), MonitorType.LED));
	      
	    list.add(new AudioPlayer("audio player 1", "audio specification 1"));
	    list.add(new MoviePlayer("movie player 1"));
	      
	  // Collections.sort(list);
	    print(list);
	}
}

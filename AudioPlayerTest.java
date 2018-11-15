/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     :AudioPlayerTest.java
 * Description  :This class tests the AudioPlayer class, it prints the details to the console
 */

package oopprogrambeta;

public class AudioPlayerTest {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayerTest1 = new AudioPlayer("apple", "apple spec");
		
		System.out.println(audioPlayerTest1);
		
		audioPlayerTest1.play();
		audioPlayerTest1.previous();
		audioPlayerTest1.next();
		audioPlayerTest1.stop();
	}
}


	
	

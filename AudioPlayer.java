/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     :AudioPlayer.java
 * Description  :This class allow us to capture the details of an audio player
 */

package oopprogrambeta;

public class AudioPlayer extends Product implements MultimediaControl {

	String audioSpecification;
	ItemType mediaType;
	
	  /**
     * public constructor AudioPlayer
     * @param: String type, name
     * @param: String type, specification
     */
	public AudioPlayer(String name, String specification) {
		super(name);							//use object name from a superclass Product
		audioSpecification = specification;
		mediaType = ItemType.AUDIO;				//set media type to audio (Audio)
	}

	@Override
	public void play() {
		System.out.println("playing");			//to emulate play instruction
	}

	@Override
	public void stop() {
		System.out.println("stop");				//to emulate stop instruction
	}

	@Override
	public void previous() {
		System.out.println("previous");			//to emulate previous instruction
	}

	@Override
	public void next() {
		System.out.println("next");				//to emulate next instruction
	}

	public String toString() {
		return
				super.toString() + "\n"+
				"Audio especification		: " + audioSpecification + "\n"+
				"Type media 				: " + mediaType;
	}
}

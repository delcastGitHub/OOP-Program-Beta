/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : MoviePlayer.java
 * Description  : This class allows us to capture details of movie player items. 
 */

package oopprogrambeta;

public class MoviePlayer extends Product implements MultimediaControl {

	Screen screenType;							//Screen type object named screenType
	MonitorType monitorType;					//MonitorType object named monitorType
	
	/**
     * public constructor MoviePlayer
     * @param: String type, name
     */
	public MoviePlayer (String name) {
		super(name);								// variable name from superclass Product
		screenType = new Screen("1040X768",120,10);	// create and instant of the object Screen named screenType
		monitorType= MonitorType.LCD;				
	}
	
	/**
     * public constructor MoviePlayer
     * @param: String type, name
     * @param: Screen type, screenType
     * @param: MonitorType, monitorType
     */
	public MoviePlayer(String name, Screen screenType, MonitorType monitorType) {
		super(name);							//Variable name from superclass Item/Product
		this.screenType=screenType;				
		this.monitorType=monitorType;			
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

	/**
     * A toString method will println information
     * @return:screenType
     * @return:monitorType
     */
	public String toString() {
		return
				super.toString()+ "\n"+
				"Screen Type		: " + screenType+ "\n"+
				"Monitor Type		: " + monitorType;
	}
}

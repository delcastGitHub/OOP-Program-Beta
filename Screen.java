/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Screen.java
 * Description  : This class allows us to capture details of screen. 
 */

package oopprogrambeta;

public class Screen implements ScreenSpec {

	String resolution;
	int refreshrate;
	int responsetime;
	
    /**
     * public constructor Screen
     * @param: String type, resolution
     * @param: Int type, refreshrate
     * @param: Int type, responsetime
     */
	public Screen (String resolution, int refreshrate, int responsetime) {
	
		this.resolution = resolution;
		this.refreshrate = refreshrate;
		this.responsetime = responsetime;	
	}
	
	@Override
	public String getResolution() {
		return resolution;
	}

	@Override
	public int getRefreshRate() {
		return refreshrate;
	}

	@Override
	public int getResponseTime() {
		return responsetime;
	}
	
	/**
     *toString method will println information
     *@return:
     * String type, resolution
     * Int Type, refreshrate
     * Int Type, responsetime
     */
	public String toString() {
		
		return
				"Resolution		: " + resolution + "\n"+
				"Refresh Rate	: "	+ refreshrate + "\n"+
				"Response time	: "	+ responsetime;				
	}
} // end of class Screen

/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Item.java
 * Description  : Interface to force all clases that implements this to add the followinf funtions.
 */


package oopprogrambeta;

import java.util.Date;


public interface Item {

	public final String manufacturerConst = "OracleProduction";
	
	/**
     * set production number
     * @param: Int type, proNumber
     */
	public void setProductionNumber (int prodNumber);
	
	/**
     * set item name
     * @param: String type, name
     */
	public void setName(String name);

	/**
     * to get the item's name
     * @return: String type
     */
	public String getName();
	
	/**
     * to get manufacture's date
     * @return: Date type
     */
	public Date getManufactureDate();
	
	/**
     * to get serial number
     * @return: Int type
     */
	public int getSerialNumber ();
	
} //end Item interface

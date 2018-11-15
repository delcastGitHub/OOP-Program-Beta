/**
 * @Author      : Milko Del Castillo
 * @Version     : v. 1.0
 * @Since       : 11/09/2018
 * FileName     : Product.java
 * Description  : It will implement the basic functionality that all items on a production line should have.
 */

package oopprogrambeta;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product>{
	
	int serialNumber;
	String manufacturer;
	Date manufacturedOn;
	String name;
	
	//Class variable - to store next number to be assigned to serialNumber
	private static int  currentProductionNumber =1;	
	
	
	/**
     * public constructor Product
     * @param: String type, name
     */
	public Product(String name) {
		setName(name);
		setProductionNumber(currentProductionNumber );	// initialized poduction serial number "1"
		currentProductionNumber++;						// incremented in readiness for next production serial number
		manufacturer = manufacturerConst;
		manufacturedOn = new Date();					//set manufacturedOn as the current date and time	
	}
	
	@Override
	public void setProductionNumber(int prodNumber) {
		serialNumber = prodNumber;
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Date getManufactureDate() {
		
		return manufacturedOn;
	}

	@Override
	public int getSerialNumber() {
		
		return serialNumber;
	}
	
	 /**
     *toString method will println information
     *@return:
     * String type, Manufacturer
     * Int Type, serialNumber
     * Date Type, manufacturedOn
     * String Type, name
     */
	public String toString() {
		
		return 
				"Manufacturer	: " + manufacturer + "\n"+
				"Serial Number	: " + serialNumber + "\n"+
				"Date			: " + manufacturedOn + "\n"+
				"Name			: " + name;
	}
	
	 /**
     *compareTo method will compare if this.name is equal,<, or > than 
     *@return:
     * int type, respuesta
     */
	public int compareTo(Product onpe) {
		
		int respuesta;
		
		respuesta = this.name.compareTo(onpe.getName());
		
		return respuesta;		
	}	
} //end of product class

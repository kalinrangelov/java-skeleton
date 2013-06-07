

package com.i42.jdb.orm;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Movie")
public class Movie 
{
	@DatabaseField(generatedId = true)
	private int id;
	
	@DatabaseField(useGetSet = true)
	private String name;
	
	@DatabaseField(useGetSet = true)
	private String street;
	
	@DatabaseField(useGetSet = true)
	private String zip;
	
	@DatabaseField(useGetSet = true)
	private String city;
	
	@DatabaseField(useGetSet = true)
	private String phone;
	
	@DatabaseField(useGetSet = true)
	private String webURL;
	
	public Movie() {
		// ORMLite needs this
	}
	
	/**
	 *   Get Object ID
	 *	@return Integer
	 */
	public int getId() {
		return id;
	}
	
	/**
	 *   Get name
	 *	@return String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 *   Get street
	 *	@return String
	 */
	public String getStreet() {
		return street;
	}
	
	/**
	 *   Get zip
	 *	@return String
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 *   Get city
	 *	@return String
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 *   Get phone
	 *	@return String
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 *   Get web URL
	 *	@return String
	 */
	public String getWebURL() {
		return webURL;
	}
	
	/**
	 *   Set movie name
	 *	@param String
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 *   Set movie street
	 *	@param String
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	/**
	 *   Set movie zip
	 *	@param String
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	/**
	 *   Set movie city
	 *	@param String
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 *   Set movie phone
	 *	@param String
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 *   Set movie web URL
	 *	@param String
	 */
	public void setWebURL(String webWebURL) {
		this.webURL = webURL;
	}

        @Override
	public String toString() {
	        return "(" + id + ") " + name;
	}
}
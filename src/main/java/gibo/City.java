package gibo;

import java.io.Serializable;

public class City implements Serializable {
	
	private static final long serialVersionUID = 27021660478479531L;
	
	public City () {}
	public City(String name, String state, String country) {
		this.name = name;
		this.state = state; 
		this.country = country;
	}
	
	
	private String name;
	private String state;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", this.name, this.state, this.country);
	}
	
	
	
}

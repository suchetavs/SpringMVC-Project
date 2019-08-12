package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String fname;
	private String lname;
	private String country;
	private String language;
	private String[] os;
	
	
	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private LinkedHashMap<String,String> countries;
	//private LinkedHashMap<String,String> languages;
	private String[] languages;
	private String[] operatingSystems;
	
	
	/*
	 * public LinkedHashMap<String,String> getLanguages() { return languages; }
	 */

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public String[] getLanguages() {
		return languages;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public Student() {
		countries=new LinkedHashMap<>();
		//languages=new LinkedHashMap<>();
		languages=new String[2];
		operatingSystems=new String[2];
		countries.put("BR", "Brazil");
		countries.put("IN", "India");
		countries.put("PL", "Palestine");
		countries.put("GM", "Germany");
		countries.put("EU", "Europe");
		languages[0]="Java";
		languages[1]="JS";
		operatingSystems[0]="Windows";
		operatingSystems[1]="MAC";
		
		/*
		 * languages.put("Java", "Java-F"); languages.put("JS", "JS-F");
		 * languages.put("Node", "Node-F"); languages.put("PHP", "PHP-F");
		 */
		
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	

}

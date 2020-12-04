package com.example.demo.model;

public class User {
	private String fName;
	private String lName;

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public void setFirstName(String fName) {
		this.fName = fName;
	}

	@Override
	public String toString() {
		String str = (fName != null) ? fName + " " : "";
		str += (lName != null) ? lName : "";
		return str.trim();
	}

}
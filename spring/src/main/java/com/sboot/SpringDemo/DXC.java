package com.sboot.SpringDemo;

public class DXC {
private int EmployeeId,year;
private String EmploymentType;
cohorts cohort;
public DXC(int employeeId, int year, String employmentType, cohorts cohort) {
	super();
	EmployeeId = employeeId;
	this.year = year;
	EmploymentType = employmentType;
	this.cohort = cohort;
}
public void display() {
	 System.out.println(EmployeeId+" "+year+" "+EmploymentType);  
	 System.out.println(cohort.toString());  
}
}

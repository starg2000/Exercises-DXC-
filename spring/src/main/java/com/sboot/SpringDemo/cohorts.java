package com.sboot.SpringDemo;

public class cohorts {

	private int cohortid;
	private String cohortname;
	private String emailid;
	private long contactno;
	
	
	
	public cohorts(int cohortid, String cohortname, String emailid, long contactno) {
		super();
		this.cohortid = cohortid;
		this.cohortname = cohortname;
		this.emailid = emailid;
		this.contactno = contactno;
	}



	@Override
	public String toString() {
		return "cohorts [cohortid=" + cohortid + ", cohortname=" + cohortname + ", emailid=" + emailid + ", contactno="
				+ contactno + "]";
	}



	
}

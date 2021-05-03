package com.sboot.SpringDemo;

public class Patient {
	private int patientid;
	private String patientName;
	private double patientHeight;
	private double patientWeight;
	private BMICalculator bmicalculator;
	
	public Patient() {
		super();
	}
	public Patient(int patientid, String patientName, double patientHeight, double patientWeight) {
		super();
		this.patientid = patientid;
		this.patientName = patientName;
		this.patientHeight = patientHeight;
		this.patientWeight = patientWeight;
	}
	public BMICalculator getBmicalculator() {
		return bmicalculator;
	}
	public void setBmicalculator(BMICalculator bmicalculator) {
		
		this.bmicalculator = bmicalculator;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public double getPatientHeight() {
		return patientHeight;
	}
	public void setPatientHeight(double patientHeight) {
		this.patientHeight = patientHeight;
	}
	public double getPatientWeight() {
		return patientWeight;
	}
	public void setPatientWeight(double patientWeight) {
		this.patientWeight = patientWeight;
	}
	
	public void calculate() {
		bmicalculator.calculateBMI(patientWeight,  patientHeight);
	}

}

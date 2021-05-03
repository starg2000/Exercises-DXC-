package com.sboot.SpringDemo;

public class BMICalculator {
	private Patient patient[];

	public Patient[] getPatient() {
		return patient;
	}

	public void setPatient(Patient[] patient) {
		this.patient = patient;
	}

	public BMICalculator() {
		super();
	}
	double calculateBMI(double patientWeight, double patientHeight) {
		double bmi;
		bmi=(patientWeight/(patientHeight*patientHeight))*703;
		if(bmi>25.0) {
			System.out.println(bmi);
		}
		else {
			System.out.println("Normal");
		}
		return 0;
	}
}

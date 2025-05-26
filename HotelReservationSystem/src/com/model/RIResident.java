package com.model;

public class RIResident extends Resident{
	private long idproofAadharno;
	public RIResident(String residentId, String residentName, int age, String gender, long contactNumber, String email,
			String address, int numberOfAdults, int numberOfChildrenAbove12, int numberOfChildrenAbove5,
			int durationOfStay, String residentType,long idproofAadharno) {
		super(residentId, residentName, age, gender, contactNumber, email, address, numberOfAdults, numberOfChildrenAbove12,
				numberOfChildrenAbove5, durationOfStay, residentType);
		this.idproofAadharno=idproofAadharno;
	}
	public long getIdproofAadharno() {
		return idproofAadharno;
	}
	public void setIdproofAadharno(long idproofAadharno) {
		this.idproofAadharno = idproofAadharno;
	}
	


}
